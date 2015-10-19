/*	------------------------------------------------------------------------------------------------------------------
 *  Author 	: Trishi Khanna
 *  Date 	: 17 OCT 2015
 *  ------------------------------------------------------------------------------------------------------------------
 *  UDF for populating the "Locality" field 
 *  ------------------------------------------------------------------------------------------------------------------
 */ 

package MBclean.MBclean;

import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.apache.pig.EvalFunc; 
import org.apache.pig.data.Tuple;
//import org.apache.commons.lang3.StringUtils;

public class MB_Locality_Refine_2 extends EvalFunc<String> {
	
	
	public String detectCity(String input_locality)
	{
				
		if (StringUtils.containsIgnoreCase(input_locality, "Faridabad"))
			return "Faridabad";
		
		else if (StringUtils.containsIgnoreCase(input_locality, "Gurgaon"))
			return "Gurgaon";
		
		else if (StringUtils.containsIgnoreCase(input_locality, "Greater Noida"))
			return "Greater Noida";
		
		else if (StringUtils.containsIgnoreCase(input_locality, "Noida"))
			return "Noida";
		
		else if (StringUtils.containsIgnoreCase(input_locality, "Ghaziabad"))
			return "Ghaziabad";
		
		else if (StringUtils.containsIgnoreCase(input_locality, "New Delhi"))
			return "New Delhi";
		
		
		else 
			return null;
				
	}
	
	private String locality(String input_locality) {
		
		String[] locality_list = new String[] {"Noida Extension", "Sector 1", "Yamuna Expressway", "Sector 4", "Pari Chowk", "Sector 16C", "Sector 16B", "Sector ZETA 1", "Sector 16", "Sector PI 1 & 2", "Tech Zone 4", "Sector 10", "OMICRON 1", "Gaur City", "Sector CHI 4", "Sector 2", "Sector CHI 5", "OMICRON 3", "Sector MU", "Sector BETA 2", "Swaran Nagari", "Sector DELTA 1", "Sector Alpha 2", "Sector Alpha 1", "Sector OMEGA 2", "Jaypee Greens", "Sector OMEGA 1", "Knowledge Park 5", "Sector BETA 1", "Sector XU 3", "Sector GAMMA 2", "Sector CHI 3", "Sector PHI 2", "Bodaki", "Sector GAMMA 1", "Dadri", "Sector DELTA 2", "OMICRON 2", "NH 91", "Sector CHI PHI", "Sector 27", "Sector MU 1", "Sector MU 2", "Sector CHI 2", "Sector PHI 3", "SIGMA 4", "OMICRON 1 A", "Sector 36", "Sector 3", "Knowledge Park 3", "Sector XU 1", "Sector XU 2", "Sector PHI 1", "UPSIDC", "Sector PHI 4", "Sector 36", "Surajpur", "Sector ETA 2", "Sector 12", "Sector RHO 1", "Sector ETA 1", "SIGMA 1", "Sector DELTA 3", "Kasna", "ECOTECH 12", "Sector PSI 1", "Sector PSI 2", "Knowledge Park 2", "SIGMA 2", "Devla", "SIGMA 3", "Sector RHO 2", "Sector ZETA 2", "AWHO 3", "Kulesara", "Sector IOTA 1", "Sector IOTA 2", "Sector KAPPA 1", "Sector KAPPA 2", "LAMBDA 1", "LAMBDA 2", "ECOTECH 1", "ECOTECH 3 (UK)", "Dhoom Manikpur", "Tech Zone 5", "Tech Zone", "Knowledge Park 1", "ECOTECH 2", "ECOTECH 3", "Tech Zone 2", "Tech Zone 3", "Knowledge Park 4", "Sector 11", "Sector 12 A", "ECOTECH 6", "ECOTECH 7", "ECOTECH 8", "ECOTECH 9", "ECOTECH 10", "ECOTECH 11", "ECOTECH 11 A", "ECOTECH 13", "ECOTECH 14", "Theta 2", "Gulistanpur", "Lakhnawali", "Girdharpur", "ECOTECH 15", "ECOTECH 16 A", "ECOTECH 1 EXTN 1", "Sector Theta", "Sector 86", "Sector 88", "Green Fields", "Sainik Colony", "Sector 87", "Sector 89", "Sector 77", "Neharpar", "Sector 85", "Sector 82", "Sector 28", "Sector 37", "Sector 76", "Ballabhgarh", "Sector 49", "Sector 78", "Sector 16", "Sector 48", "Charmwood Village", "Surajkund Road", "Sector 21D", "Sector 70", "Sector 30", "Sector 21C", "Sector 35", "Sector 46", "New Industrial Township", "Sector 84", "Palwal", "Sector 99", "Sector 81", "Sector 31", "Jasana", "Sector 75", "Sector 10", "Sector 17", "Sector 8", "Ashoka Enclave", "Sector 19", "Jawahar Colony", "Sector 2", "Sector 7", "Sector 62", "Sector 3", "Sector 80", "Sector 11", "Sector 9", "Old Faridabad", "Indraprastha Colony", "Sector 45", "Surya Nagar", "Sector 29", "Sector 23", "Sector 91", "Sector 15A", "Sector 55", "Sector 21A", "Sector 56", "Sector 15", "New Industrial Township No 1", "New Industrial Township No 5", "Sector 21B", "Sector 65", "Sector 64", "Sehatpur", "Mathura Road", "Sector 34", "Ismailpur", "Sector 63", "Dabuwa Colony", "Sector 18", "Spring Field Colony", "Vinay Nagar", "Parvatiya Colony", "Suraj Kund", "Pali", "Sector 22", "Sector 14", "Tilpat", "New Industrial Township No 3", "Sector 16A", "Sector 43", "Dayal Bagh", "New Industrial Township No 2", "Badhkal", "Ashoka Enclave 3", "Gandhi Colony", "Shiv Durga Vihar", "Sector 4", "Sector 52", "Sector 83", "Kanwara Village", "Sector 20A", "Kabulpur", "Sector 71", "Sector 32", "Manjhawali Village", "Nangla Gujran", "Chawla Colony", "New Industrial Township No 4", "Sector 36", "Agwanpur", "Friends Colony", "Sector 20", "Sector 33", "Sector 97", "Mithapur", "Sector 57", "Sector 109", "Chandpur", "Bhopani Village", "Palwal Alighar Highyway", "Sector 79", "Ankhir", "Katan Pahari", "Nehru Colony", "Sector 24", "Sector 39", "Sector 41", "Sector 58", "Sector 5", "Tigaon", "Gazipur", "Sector 72", "Sector 104", "Fatehpur Billoch", "Ajit Nagar", "Gurukul Basti", "Jeevan Nagar", "Mewala Maharajpur", "Old Chungi", "Sector 12", "Sector 13", "Sector 25", "Sector 27A", "Sector 27", "Sector 59", "sector 6", "Shastri Colony", "Yadav Colony", "Sector 54", "Sector 42", "Basantpur", "Tikawali village", "Sholaka", "Pirthla", "Sector 53", "Rajpur Kalan", "Sector 132", "Railway Colony", "Dhouj", "Sector 50", "Sector 51", "Kirawali", "Sector 69", "Sector 1", "Asoati", "Sector 67", "Sector 47", "Sector 56", "Sector 49", "Sector 50", "Sector 54", "Sector 48", "Sohna Road", "Sector 52", "Sector 25", "Sector 43", "Sector 51", "Sushant Lok 1", "Palam Vihar", "Sector 15", "Sector 86", "Sector 57", "Sector 27", "DLF 3", "Sector 69", "Sector 81", "Sector 31", "Sector 83", "Sector 37 C", "Sector 67", "Sector 66", "Sector 82", "Sector 45", "Sector 85", "Sector 46", "Sector 37 D", "Sector 92", "Sector 14", "Sohna Sector 35", "Golf Course Road", "Sector 23", "Sector 71", "Sector 22", "South City", "Sector 53", "DLF 2", "Sector 79", "Sector 58", "Sector 23 A", "DLF 1", "Sector 39", "Sector 40", "Sector 42", "Sector 68", "Sector 90", "Sector 70", "Sector 24", "Sector 7", "Sector 21", "Sector 4", "Sector 72", "Sector 103", "Sohna", "Sector 70 A", "Sector 17", "Sector 38", "Sector 28", "MG Road", "Sector 5", "Sector 110 A", "Sector 26", "DLF 4", "Sector 55", "Sector 9", "Sector 91", "Sector 84", "Sector 30", "Sector 33", "Sector 104", "Sector 78", "Sector 65", "Sushant Lok 2", "Sector 89", "Sector 1", "Sector 77", "Laxman vihar", "Sector 10 A", "Sohna Sector 2", "Sector 10", "Sector 109", "Sushant Lok 3", "Sector 80", "Sector 41", "DLF V", "Sector 99", "Palam Vihar Extension", "Sohna Sector 6", "Sector 3", "Sohna Sector 4", "Sector 102", "Sector 99A", "Sector 111", "Sector 59", "Sector 63", "NH 8", "Sector 9 A", "Sector 108", "Sohna Sector 33", "Sector 107", "Civil Lines", "Ashok Vihar Phase 2", "Sector 12", "Sector 95", "Sector 106", "Manesar", "Patel Nagar", "Ashok Vihar Phase 3", "Golf Course Extn", "Sector 110", "Sector 3", "Dwarka Expressway", "Sector 61", "Sector 88A", "Gurgaon Faridabad Road", "Sector 37", "Sector 62", "Old Delhi Gurgaon Road", "Sector 73", "Sector 11", "Sector 8", "Sohna Sector 14", "Sector 105", "Sector 12 A", "Sector 13", "Sector 76", "Pataudi", "Sector 82 A", "Sector 88B", "Sector M 1", "Sector 112", "Sector M 1 A", "Gwal Pahari", "Garhi Harsaru", "Sector 93", "Sector 19", "Sector 34", "New Gurgaon", "Sector 3 A", "Khandsa road", "Sector 29", "Sector 36", "Sector 2", "Sector 89A", "Sector 18", "Sector 102 A", "Bhondsi", "Udyog Vihar   Industrial Area Phase 4", "Sector 44", "Sector 60", "Sector 32", "Sector 113", "Sultanpur", "Sector 6", "Sector 9 B", "Farukh Nagar", "Sushant Lok Extension", "Sector 52 A", "Sector 88", "Sector 16", "Sector 114", "Sector 81 A", "Sector 103A", "Sector 6 A", "Sector 74", "Sector 37 A", "Sector M 7", "Jhajjar Road", "MANESAR VILLAGE", "Sohna Sector 7", "Roshan Pura", "Sector 20", "Sector 35", "Sector 64", "Sector 75", "Sector 87", "Sector 94", "Sector 96", "Sector 72 A", "Sector 97", "Sector 98", "Sector 100", "Sector 101", "Sector 115", "Sector 26 A", "Sector 37 B", "Sector 74 A", "Sector M 3", "Sector M 4", "Sector M 5", "Sector M 6", "Sector M 8", "Sector M 9", "Sector M 10", "Sector M 11", "Sector M 12", "Sector M 13", "Sector M 14", "Sector M 15", "Sector M 16", "Sector M 1 B", "Sector M 1 C", "Sector M 3 A", "Sector M 1 D", "Nihal Colony", "Sector 95A", "Sector 89B", "Sector 95B", "Mankrola", "Budhera", "Bissar Akbarpur", "New Palam Vihar", "Uttam Nagar", "L Zone", "Vasant Kunj", "Mayur Vihar Phase 1", "Chhatarpur", "Laxmi Nagar", "Janakpuri", "Malviya Nagar", "Dwarka", "Saket", "Lajpat Nagar", "East Of Kailash", "Patel Nagar", "Dwarka Mor", "Pitampura", "Kalkaji", "Vikas Puri", "Tilak nagar", "Safdarjung Enclave", "Paschim Vihar", "Dwarka Sector 23", "Mehrauli", "Sarita Vihar", "Mayur Vihar Phase 3", "Govindpuri", "Dwarka Sector 19", "Shahdara", "New Ashok Nagar", "Dwarka Sector 12", "Preet Vihar", "Greater Kailash 2", "Dwarka Sector 4", "Dwarka Sector 18", "Dwarka Sector 22", "Neb Sarai", "Dwarka Sector 6", "Rajouri Garden", "South Extension Part 1", "Dwarka Sector 7", "Shakarpur", "Rohini Sector 9", "Hari Nagar", "Dwarka Sector 10", "Green Park", "Defence Colony", "Patparganj", "Hauz Khas", "Karol Bagh", "Rajender Nagar", "Moti Nagar", "Mahavir Enclave", "Rohini", "Badarpur", "Dilshad Garden", "Vasundhara Enclave", "Subhash Nagar", "Dwarka Sector 3", "Indraprastha Extension", "Dwarka Sector 11", "Dwarka Sector 14", "Jangpura", "Jasola", "Rohini Sector 24", "Gautam Nagar", "Khanpur", "Najafgarh", "Ramesh Nagar", "Tagore Garden", "Okhla", "Shalimar Bagh", "Khirki Extension", "Burari", "Dwarka Sector 9", "Jamia Nagar", "Rohini Sector 28", "Mayur Vihar Phase 2", "Pandav Nagar", "Rohini Sector 13", "Mukherjee Nagar", "South Extension Part 2", "Model Town", "Dwarka Sector 13", "New Friends Colony", "Punjabi Bagh", "Ashok Vihar", "Vasant Vihar", "Chittaranjan Park", "Rohini Sector 16", "Kamla Nagar", "Mandawali", "Rohini Sector 15", "Arjun Nagar", "Dwarka Sector 8", "Rohini Sector 8", "Mayur Vihar Phase 1 Extension", "Dwarka Sector 1", "Sant Nagar", "Dwarka Sector 5", "Palam", "Kirti Nagar", "Sheikh Sarai", "Anand Vihar", "Aya Nagar", "Ghitorni", "Rohini Sector 22", "Shakti Nagar", "Rohini Sector 11", "Rohini Sector 3", "Rohini Sector 7", "Narela", "Lado Sarai", "Vishnu Garden", "Dwarka Sector 17", "Vinod Nagar West", "Munirka", "Shastri Nagar", "Rani Bagh", "Yamuna Vihar", "Krishna Nagar", "Dwarka Sector 2", "Dwarka Sector 26", "Rohini Sector 14", "Rohini Sector 29", "Adarsh Nagar", "Pahar Ganj", "Tughlakabad", "Mayur Vihar", "Dwarka Sector 19B", "Rohini Sector 1", "Rohini Sector 18", "Ganesh Nagar", "Vijay Nagar", "Panchsheel Park", "Naraina", "P II Zone", "Nawada", "Vivek Vihar", "Sultanpur", "Gagan Vihar", "Kailash Colony", "Rohini Sector 34", "Rohini Sector 4", "Rohini Sector 5", "Bakhtawarpur", "C R Park", "Nangloi", "Ashram", "Geeta Colony", "Maharani Bagh", "Mahipalpur", "Bhajanpura", "Devli", "Nirman Vihar", "Tri Nagar", "Rohini Sector 25", "Karkardooma", "Govindpuri Extension", "Sangam Vihar", "Budh Vihar", "Shadipur", "Ashok Nagar", "Rohini Sector 17", "Dwarka Sector 24", "Connaught Place", "Mansarover Garden", "Gulmohar Park", "Sainik Farm", "Jor Bagh", "Kakrola", "Barakhamba Road", "Akshar Dham", "Alaknanda", "Dabri", "Sukhdev Vihar", "Moti Bagh", "Rohini Sector 21", "Chirag Delhi", "Pushp Vihar", "Freedom Fighter Enclave", "Sagar Pur", "Civil Lines", "Rohini Sector 6", "Nehru Place", "Azadpur", "Inderpuri", "Vinod Nagar East", "Dwarka Sector 16 B", "Batla house", "Bhogal", "G T B Nagar", "Sarai Rohilla", "Sonia Vihar", "Dwarka Sector 16", "Keshavpuram", "Raj Nagar", "Malka Ganj", "Rohini Sector 23", "Jhilmil Colony", "Sri Niwaspuri", "Madangir", "Rohini Sector 2", "Savitri Nagar", "Kapashera", "Panchsheel Enclave", "Jahangir Puri", "GTB Enclave", "Raja Garden", "Wazirabad", "Karampura", "Mundka", "Fateh Nagar", "Kalyan Vihar", "Greater Kailash 3", "Loknayakpuram", "Sidhartha Nagar", "Gujranwala Town", "Gulabi Bagh", "Pulpahladpur", "Timarpur", "Katwaria Sarai", "Daryaganj", "Vishal Enclave", "Dwarka Sector 15", "Begumpur", "Inderlok", "Kanjhawala", "Dwarka Sector 21", "Siri Fort", "Lodi Colony", "Yusuf Sarai", "Rohini East", "Bindapur", "Qutub Vihar", "Vijay Vihar", "Bawana", "Matiala", "Lawrence Road", "Anand Parbat", "Fatehpur Beri", "Rohini Sector 30", "Sarojini Nagar", "Seelampur", "Nizamuddin", "Karawal Nagar", "Maidangarhi", "Brahmpuri", "Rohini Sector 20", "Kondli", "Tis hazari", "Bakkar Wala", "Dwarka Sector 20", "Rohini Sector 35", "Nilothi", "Bijwasan", "Madanpur Khadar", "R K Puram", "Yojana Vihar", "Sunlight Colony", "Indraprastha Estate", "Trilokpuri", "Dwarka Sector 28", "Chawri Bazar", "Johripur", "Prem Nagar", "Shakurpur", "Ghazipur", "Mandi House", "Khajoori Khas", "Khureji", "Sadar bazar", "Sultanpuri", "Dwarka Sector 16 A", "Jhandewalan", "Manglapuri", "Vaishali", "Harsh Vihar", "Mukundpur", "Bali Nagar", "Rangpuri", "Azad Nagar", "Bhagwan Das Road", "Rithala", "Sundar Nagar", "Dashrath Puri", "Nangal Raya", "Mayapuri", "Satbari", "Seemapuri", "Rohini Sector 27", "Delhi Cantoment", "Wazirpur", "Siraspur", "Gandhi Nagar", "Roop Nagar", "Jaitpur", "Asian Games Village Complex", "Badli", "Mangolpuri", "Navjeevan Vihar", "Shahpura", "Pira Garhi", "Rohini Sector 19", "Sector 90", "Sadiq Nagar", "Rohini Sector 37", "Alipur", "Chandni Chowk", "Savita Vihar", "Chhawla", "Razapur Khurd", "Kair", "Chanakyapuri", "Rohini Sector 32", "Shastri Park", "Soami Nagar", "Jharoda Majra Burari", "Mustafabad", "Dakshinpuri", "Ber Sarai", "Golf Links", "Inder Enclave", "Kashmiri Gate", "Pragati Maidan", "Rohini Extension", "Tilak Marg", "Sonepat", "Vikas Kunj", "Dera Mandi", "Surajkund", "Adchini", "Rohini Sector 38", "Ranjeet Nagar", "Bapa Nagar", "Bharat Nagar", "Dhaula Kuan", "Vigyan Vihar", "Kalindi Kunj", "Tilangpur Kotla", "Hastsal", "Mithapur", "AIIMS", "Ajmeri Gate", "Babarpur", "Chaman Vihar", "Gokalpur", "West Enclave", "Chokhandi", "Sunder Nagari", "Meerut", "Kidwai Nagar", "Karala", "Bahapur", "Sector 45", "Vrindavan", "Kalu Sarai", "Singhu", "Ranhola", "Bhikaji Cama Place", "Dwarka Sector 27", "Sector 9A", "Sector 91", "Gol Market", "Khan Market", "Lakshmi Bai Nagar", "Lal Kuan", "Rohini Sector 10", "Rohini Sector 12", "Rohini West", "Moradabad", "Sarai Kale Khan", "Haibutpur", "Sohna", "sector 150", "Balbir Nagar", "Sector 49, Faridabad", "Bhalswa", "Goyla Village", "Rohini Sector 36", "Deenpur", "Daya Basti", "Gopalpur Village", "Khera Kalan", "Sawda", "Dummy", "Kaka Nagar", "Indirapuram", "Vaishali", "Raj Nagar Extension", "NH 24", "Crossing Republik", "Vasundhara", "Govind Puram", "Lal Kuan", "Kaushambi", "Vaishali Sector 4", "Indraprastha Yojna", "Abhay Khand", "Shalimar Garden", "Sahibabad", "Vaishali Sector 3", "Niti Khand I", "Siddharth Vihar", "Vaishali Sector 5", "Pratap Vihar", "GT Road", "Vijay Nagar", "Gyan Khand 1", "Shalimar Garden Extention 1", "Raj Nagar", "Vaishali Sector 2", "Loni", "Vasundhara Sector 5", "Shakti Khand 3", "NH 24 Bypass", "Vaishali Extension", "Vaibhav Khand", "Shastri Nagar", "Rajendra Nagar", "vasundhara sector 3", "Ramprastha", "Shalimar Garden Extention 2", "NH 58", "Madhuban Bapudham", "Vaishali Sector 1", "Vasundhara Sector 3", "Trans Delhi Signature City", "Ahinsa Khand 2", "Niti Khand 3", "Nyay Khand 1", "Surya Nagar", "Vasundhara Sector 1", "Gyan Khand 2", "Bhopura", "Patel Nagar", "NH 91", "Shakti Khand 2", "Shakti Khand 4", "Vasundhara Sector 1", "Kavi Nagar", "Vasundhara Sector 10", "Nehru Nagar 3", "Ankur Vihar", "Vasundhara Sector 2", "Sanjay Nagar", "Gyan Khand 4", "Mohan Nagar", "Nandgram", "Chiranjiv Vihar", "Koyal Enclave", "Vaishali Sector   6", "Nyay Khand 3", "Nehru Nagar", "Wave City", "Vasundhara Sector 5", "Dasna", "Vasundhara Sector 6", "Vasundhara Sector 13", "Niti Khand 2", "Mahurali", "Vasundhara Sector 9", "Modinagar", "Pilkhuwa", "Vasundhara Sector 4", "Vasundhara Sector 18", "Vasundhara Sector 13", "Ahinsa Khand 1", "Dundahera", "Chhapraula", "Vasundhara Sector 15", "Chander Nagar", "Avantika", "Vasundhara Sector 12", "Vasundhara Sector 10", "Vasundhara Sector 16", "Vasundhara Sector 16", "Gyan Khand 3", "Lohia Nagar", "Vasundhara Sector 9", "Vasundhara Sector 11", "Vasundhara Sector 17", "Nyay Khand 2", "Dilshad Extension", "Crossings NH 24", "Muradnagar", "Vasundhara Sector 12", "Vasundhara Sector 14", "Krishna Vihar", "Vasundhara Sector 11", "Shakti Khand 1", "Swaran Jyanti Puram", "Hapur Road", "Vasundhara Sector 15", "Model Town", "Naya Ganj", "Vasundhara Sector 7", "Pandav Nagar", "Ambedkar Road", "Sewa Nagar", "Lajpat Nagar", "Vasundhara Sector 6", "Ankur Vihar", "Vasundhara Sector 14", "Vasundhara Sector 2B", "Nehru Nagar 2", "Panchsheel Enclave", "Ghukna", "Vasundhara Sector 19", "Sehani Khurd", "Daulatpura", "Madhopura", "Defence Colony", "Vasundhara Sector 4", "Vasundhara Sector 18", "Harbans Nagar", "Harsaon", "Kamla Nehru Nagar", "Shatabdipuram", "Vasundhara Sector 8", "Marium Nagar", "Shahpur Bamheta", "Delhi Wazirabad Road", "Nai Basti Dundahera", "Vasundhara Sector 17", "Vasundhara Sector 2A", "Maliwara", "Kala Patther", "Bhuapur", "Raghunathpur", "Raispur", "Bhram Puri", "Neelmani Colony", "Sadiqpur", "Behta Hazipur", "Bhim Nagar", "Hindan Residential Area", "Vasundhara Sector 7", "Vasundhara Sector 19", "Judges Enclave", "Janakpuri", "Amrit Nagar", "Vasundhara Sector 8", "Ved Vihar", "Lalbag Colony", "Farukh Nagar", "Sector 137", "Sector 76", "Sector 78", "Sector 77", "Sector 74", "Sector 53", "Sector 110", "Sector 120", "Sector 45", "Sector 100", "Sector 50", "Sector 143", "Sector 62", "Sector 121", "Sector 51", "Sector 75", "Sector 104", "Sector 119", "Sector 134", "Sector 49", "Sector 73", "Sector 128", "Sector 19", "Sector 34", "Sector 82", "Sector 93", "Sector 41", "Sector 46", "Sector 150", "Sector 107", "Sector 26", "Sector 168", "Sector 40", "Sector 72", "Sector 31", "Sector 79", "Sector 52", "Sector 93 A", "Sector 44", "Sector 118", "Sector 68", "Sector 61", "Sector 12", "Sector 22", "Sector 93 B", "Sector 70", "Sector 20", "Sector 151", "Sector 144", "Sector 108", "Noida Greater Noida Expressway", "Sector 47", "Sector 166", "Sector 122", "Sector 27", "Sector 89", "Sector 29", "Sector 39", "Sector 105", "Sector 129", "Sector 21", "Sector 99", "Sector 37", "Sector 25", "Sector 135", "Sector 48", "Sector 133", "Sector 11", "Sector 23", "Sector 71", "Sector 28", "Sector 33", "Sector 36", "Sector 92", "Sector 117", "Sector 15", "Sector 4", "Sector 94", "Sector 55", "Sector 30", "Sector 131", "Sector 35", "Dadri Road", "Sector 63", "Sector 16", "Sector 32", "Sector 113", "Sector 1", "Sector 56", "Sector 42", "Noida Greater Noida Link Rd", "Sector 10", "Sector 62 A", "Sector 14", "Sector 16 B", "Sector 57", "Sector 18", "Sector 3", "Sector 5", "Sector 162", "Sector 126", "Sector 15 A", "Sector 83", "Sector 86", "Sector 149", "Sector 16 A", "Sector 96", "Sector 163", "Sector 143 B", "Sector 58", "Sector 9", "Sector 125", "Sector 102", "Sector 80", "Sector 66", "Sector 132", "Sector 116", "Sector 123", "Sector 145", "Sector 84", "Sector 112", "Sector 88", "Sector 43", "Sector 130", "Sector 90", "Sector 115", "Sector 106", "Sector 98", "Sector 6", "Sorkha", "Sector 17", "Sector 25 A", "Sector 2", "Sector 8", "Sector 165", "Sector 143 A", "Sector 138", "Sector 91", "Sector 140", "Sector 24", "Sector 38", "Sector 59", "Sector 60", "Sector 64", "Sector 65", "Sector 7", "Sector 81", "Sector 124", "Sector 127", "Sector 167", "Sector 164", "Sector 161", "Sector 159", "Sector 158", "Sector 157", "Sector 156", "Sector 155", "Sector 154", "Sector 153", "Sector 152", "Sector 147", "Sector 146", "Sector 136", "Sector 142", "Sector 97", "Sector 67", "Sector 69", "Sector 85", "Sector 87", "Sector 95", "Sector 101", "Sector 141", "Sector 148", "Sector 160", "Sector 14 A", "Sector 94 A", "Sector 140 A", "Sector 167 B","Govindpuram","Sarafabad","Anand Nagar","Chhattarpur","Krishna Park","Lok Nayak Puram","Jhangir Puri","Sector-4"};

    String output_locality = null;
		
		try
		{
		for (String locality : locality_list)
		{
			if (StringUtils.containsIgnoreCase(input_locality, locality)) // Direct Match
			{
				output_locality = locality;
			break;
			}
						
			else
			{// No change
				//output_locality = input_locality;
				output_locality=null;
				
			
		}
		
		}
		return output_locality;
		
	}
	catch(Exception e)
	{
		return null;
	}
	}
		
	

	
	

	
	
	
	@Override
	public String exec(Tuple input)  throws IOException {
		
		if (input == null || input.size() == 0)
		     return null;
		 try{
		     String str = (String)input.get(0);
		     return locality(str);
		     }
		 catch(Exception e)
		 {
		    	 //String str = (String)input.get(0);
		    	 return null;
		 }
	}

	

}
