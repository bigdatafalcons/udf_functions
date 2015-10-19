register MBclean.jar;

DEFINE price_sep MBclean.MBclean.PriceSeperator();
DEFINE area MBclean.MBclean.Area_Conversion();

DEFINE floor_number MBclean.MBclean.MB_Floor_Details_Floor_Number();
DEFINE floor_units MBclean.MBclean.MB_Floor_Details_Units_On_Floor();


DEFINE build_area MBclean.MBclean.Mb_build_area();
DEFINE carpet_area MBclean.MBclean.Mb_carpet_area();
DEFINE plot_area MBclean.MBclean.Mb_plot_area();

DEFINE price_sqft MBclean.MBclean.price_per_sqft();
DEFINE flooring MBclean.MBclean.flooring();
DEFINE overlooking MBclean.MBclean.overlooking();
DEFINE amenties MBclean.MBclean.Amenities_mb();

DEFINE mb_location MBclean.MBclean.MB_Locality_Refine();
DEFINE mb_location_city MBclean.MBclean.MB_Fetch_Locality_City();


file_record = LOAD '/home/rillakya/mbtest.tsv' using PigStorage('\t')as(apartments_url:chararray,apartments_property_id:int,apartments_posted_on:chararray,apartments_description:chararray,apartments_price:chararray,apartments_price_unit:chararray,apartments_sqft_price:chararray,apartments_bedrooms:int,apartments_bath:int,apartments_balconies:int,apartments_floor:chararray,
apartments_area_detail:chararray,apartments_area:chararray,apartments_furnishing:chararray,apartments_type_of_ownership:chararray,apartments_age:chararray,apartments_facing:chararray,apartments_location:chararray,apartment_cityName:chararray,apartments_amenities:chararray,apartments_status:chararray,apartments_overlooking:chararray,apartments_flooring:chararray,apartments_landmarks:chararray,apartments_project_name:chararray);
transformed_columns = FOREACH file_record GENERATE apartments_url, apartments_property_id, apartments_posted_on, apartments_description , price_sep (apartments_price) as apartments_price, apartments_price_unit , price_sqft(apartments_sqft_price) as price_per_sqft , apartments_bedrooms , apartments_bath , apartments_balconies , floor_units(apartments_floor) as UnitsOnTheFloor, floor_number(apartments_floor) as FloorNumber, build_area(apartments_area_detail) as Buildarea,carpet_area(apartments_area_detail) as Carpetarea,plot_area(apartments_area_detail) as Plotarea , area(apartments_area) as Area , apartments_furnishing, apartments_type_of_ownership, apartments_age, apartments_facing,mb_location(apartments_location) as Location,mb_location_city(apartments_location) as Location_city,apartment_cityName, amenties(apartments_amenities) as Amenties, apartments_status, overlooking(apartments_overlooking) as Overlooking, flooring(apartments_flooring) as Flooring, apartments_landmarks, apartments_project_name;
DUMP transformed_columns; 

