register MBclean.jar;
DEFINE floor_number MBclean.MBclean.MB_Floor_Details_Floor_Number();
DEFINE floor_units MBclean.MBclean.MB_Floor_Details_Units_On_Floor();
A = LOAD '/home/rillakya/MagicBrickstest.tsv' using PigStorage('\t')as(apartments_url:chararray,apartments_property_id:int,apartments_posted_on:chararray,apartments_description:chararray,apartments_price:chararray,apartments_price_unit:chararray,apartments_sqft_price:chararray,apartments_bedrooms:int,apartments_bath:int,apartments_balconies:int,apartments_floor:chararray,
apartments_area_detail:chararray,apartments_area:chararray,apartments_furnishing:chararray,apartments_type_of_ownership:chararray,apartments_age:chararray,apartments_facing:chararray,apartments_location:chararray,apartments_amenities:chararray,apartments_status:chararray,apartments_overlooking:chararray,apartments_flooring:chararray,apartments_landmarks:chararray,apartments_project_name:chararray);
B = FOREACH A GENERATE floor_number(apartments_floor) as FloorNumber,floor_units(apartments_floor) as UnitsOnTheFloor;
DUMP B;
