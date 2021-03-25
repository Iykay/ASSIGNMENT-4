import redis.clients.jedis.Jedis;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;

public class database {

	public static Object map;

	public static void main(String[] args) {
		 String key = "stuff";
		 Jedis jedis = new Jedis("localhost");
		 
		 Map<String, Double> scoreMembers = new HashMap<String, Double>();
		 //scoreMembers.put("State", "Unemployed");
		 scoreMembers.put( "Abia",225834.9);
		 scoreMembers.put( "Adamawa",119803.4);
		 scoreMembers.put( "Akwa Ibom",601160.6);
		 scoreMembers.put( "Anambra",148753.5);
		 scoreMembers.put( "Bauchi",113670.0);
		 scoreMembers.put( "Bayelsa",219787.9);
		 scoreMembers.put( "Benue",242530.2);
		 scoreMembers.put( "Borno",91242.87);
		 scoreMembers.put( "Cross River",295582.6);
		 scoreMembers.put( "Delta",371993.7);
		 scoreMembers.put( "Ebonyi",51841.791);
		 scoreMembers.put( "Edo",233227.5);
		 scoreMembers.put( "Ekiti",86747.09);
		 scoreMembers.put( "Enugu",395165.3);
		 scoreMembers.put( "Gombe",193732.6);
		 scoreMembers.put( "Imo",616535.0);
		 scoreMembers.put( "Jigawa",74741.75);
		 scoreMembers.put( "Kaduna",307320.2);
		 scoreMembers.put( "Kano",623918.8);
		 scoreMembers.put( "Katsina",117205.0);
		 scoreMembers.put( "Kebbi",51596.268);
		 scoreMembers.put( "Kogi",310440.0);
		 scoreMembers.put( "Kwara",96048.391);
		 scoreMembers.put( "Lagos",870662.5);
		 scoreMembers.put( "Nassarawa",80864.932);
		 scoreMembers.put( "Niger",374585.1);
		 scoreMembers.put( "Ogun",97512.26);
		 scoreMembers.put( "Ondo",237797.1);
		 scoreMembers.put( "Osun",27492.32);
		 scoreMembers.put( "Oyo",268564.9);
		 scoreMembers.put( "Plateau",202107.3);
		 scoreMembers.put( "Rivers",1124057.2);
		 scoreMembers.put( "Sokoto",89963.0);
		 scoreMembers.put( "Taraba",78361.62);
		 scoreMembers.put( "Yobe",60354.25);
		 scoreMembers.put( "Zamfara",39285.39);
		 scoreMembers.put( "FCT",228766.2);
		 jedis.zadd(key, scoreMembers);
		 //jedis.zadd(key, "State", "Unemployed");
		 
		 Map<String, Double> value = scoreMembers;
		 
		 String[] states = new String[]{"Abia", "Adamawa", "Akwa Ibom", "Anambra", "Bauchi", "Bayelsa", "Benue", "Borno",
				 "Cross River", "Delta", "Ebonyi", "Edo", "Ekiti", "Enugu", "Gombe", "Imo", "Jigawa", "Kaduna", "Kano", "Katsina",
				 "Kebbi", "Kogi", "Kwara", "Lagos", "Nassarawa", "Niger", "Ogun", "Ondo", "Osun", "Oyo", "Plateau", "Rivers", "Sokoto",
				 "Taraba", "Yobe", "Zamfara", "FCT"};

		 JComboBox<String> myStates = new JComboBox<String>(states);
		// get the selected item:
		String dropdown = (String) myStates.getSelectedItem();
		//System.out.println("Select a state: " + dropdown);
		 //System.out.println("Enter the name of the state:");*/
		 
		 System.out.println(jedis.ping());//ZADD
		 //scoreMembers.set(90d, "Python");
		 //scoreMembers.put(80d, "Javascript");
		 //jedis.zadd(key, scoreMembers);
		 
		// System.out.print("The output is "+jedis.zscore(key, ""));
}

	public static Object entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	/*private static void add(JComboBox<String> myStates) {
		// TODO Auto-generated method stub
		String[] states = new String[]{"Abia", "Adamawa", "Akwa Ibom", "Anambra", "Bauchi", "Bayelsa", "Benue", "Borno",
		 "Cross River", "Delta", "Ebonyi", "Edo", "Ekiti", "Enugu", "Gombe", "Imo", "Jigawa", "Kaduna", "Kano", "Katsina",
		 "Kebbi", "Kogi", "Kwara", "Lagos", "Nassarawa", "Niger", "Ogun", "Ondo", "Osun", "Oyo", "Plateau", "Rivers", "Sokoto",
		 "Taraba", "Yobe", "Zamfara", "FCT"};

		JComboBox<String> myStates1 = new JComboBox<String>(states);

		add(myStates1);

		// get the selected item:
		String dropdown = (String) myStates1.getSelectedItem();
		System.out.println("Select a state: " + dropdown);
		//System.out.println("Enter the name of the state:");*/
	}

