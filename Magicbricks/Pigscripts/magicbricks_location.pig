register MBclean.jar;
DEFINE locality_city MBclean.MBclean.MB_Fetch_Locality_City();

A = LOAD '/home/rillakya/data_analytics_organized.tsv' using PigStorage('\t')as(apartments_url:chararray,apartments_property_id:int,apartments_posted_on:chararray,apartments_description:chararray,apartments_price:chararray,apartments_price_unit:chararray,apartments_sqft_price:chararray,apartments_bedrooms:int,apartments_bath:int,apartments_balconies:int,apartments_floor:chararray,
apartments_area_detail:chararray,apartments_area:chararray,apartments_furnishing:chararray,apartments_type_of_ownership:chararray,apartments_age:chararray,apartments_facing:chararray,apartments_location:chararray,apartments_amenities:chararray,apartments_status:chararray,apartments_overlooking:chararray,apartments_flooring:chararray,apartments_landmarks:chararray,apartments_project_name:chararray);
B = FOREACH A GENERATE apartments_location,locality_city(apartments_location);
DUMP B;
STORE B INTO 'file:/home/rillakya/outputlocation.tsv';