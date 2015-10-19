register CommonFloor.jar;
DEFINE cf_price CommonFloor.CommonFloor.commonfloor_PriceSeperator();
A = LOAD '/home/rillakya/commonfloor_formatted.tsv' using PigStorage('\t')as(id:int,posted_on:chararray,price:chararray,price_unit:chararray,bedrooms:int,bathrooms:int,floor:chararray,	built_up_area:chararray,built_up_area_unit:chararray,age:chararray,facing:chararray,location:chararray,address:chararray,amenities:chararray);
B = FOREACH A GENERATE cf_price(price);
DUMP B;
STORE B INTO 'file:/home/rillakya/cfprice.tsv';