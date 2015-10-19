register MBclean.jar;
DEFINE Mb_build_area MBclean.MBclean.Mb_build_area();
DEFINE Mb_carpetarea MBclean.MBclean.Mb_carpet_area();
DEFINE Mb_plotarea MBclean.MBclean.Mb_plot_area();
A = LOAD '/home/rillakya/mbtest.tsv' using PigStorage('\t')as(apartments_url:chararray,apartments_property_id:int,apartments_posted_on:chararray,apartments_description:chararray,apartments_price:chararray,apartments_price_unit:chararray,apartments_sqft_price:chararray,apartments_bedrooms:int,apartments_bath:int,apartments_balconies:int,apartments_floor:chararray,
apartments_area_detail:chararray,apartments_area:chararray,apartments_furnishing:chararray,apartments_type_of_ownership:chararray,apartments_age:chararray,apartments_facing:chararray,apartments_location:chararray,apartment_cityName:chararray,apartments_amenities:chararray,apartments_status:chararray,apartments_overlooking:chararray,apartments_flooring:chararray,apartments_landmarks:chararray,apartments_project_name:chararray);
B = FOREACH A GENERATE Mb_build_area(apartments_area_detail) as Buildarea,Mb_carpetarea(apartments_area_detail) as carpetarea,Mb_plotarea(apartments_area_detail) as plotarea;
DUMP B;