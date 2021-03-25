import java.util.HashMap;
import java.util.Map;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.lang.NullPointerException;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

/**
 *
 * @author USER
 */
public class visual {
    static HashMap<Double, String> redisData = new HashMap<Double, String>();
	public static Component scoreMembers;
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("rawtypes")
	public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        database database = new database();
       HashMap<Double, String> redisData = new HashMap<Double, String>();
       
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
        
         if (jedis.zcard("stuff") == null || jedis.zcard("stuff") == 0) {
            jedis.zadd("stuff", (Map<String, Double>) database.map);
        }
        
         for(Tuple t: jedis.zrangeByScoreWithScores("stuff", 0, 100)){
        System.out.println(t.getScore());
        redisData.put(t.getScore(),t.getElement());
        }
         
        ArrayList<String> states = new ArrayList<String>();
         for (Map.Entry m : redisData.entrySet()) {
             states.add((String)m.getValue());
         }
         
         String[] statesArray = new String[states.size()];
         states.toArray(statesArray);
         String[] state = new String[]{"Abia", "Adamawa", "Akwa Ibom", "Anambra", "Bauchi", "Bayelsa", "Benue", "Borno",
				 "Cross River", "Delta", "Ebonyi", "Edo", "Ekiti", "Enugu", "Gombe", "Imo", "Jigawa", "Kaduna", "Kano", "Katsina",
				 "Kebbi", "Kogi", "Kwara", "Lagos", "Nassarawa", "Niger", "Ogun", "Ondo", "Osun", "Oyo", "Plateau", "Rivers", "Sokoto",
				 "Taraba", "Yobe", "Zamfara", "FCT"};

        JComboBox<String> myStates = new JComboBox<>(state);
        myStates.addItemListener(new Handler());
       // stateList.addItemListener(null);
        
         
// add to the parent container (e.g. a JFrame):
        JFrame jframe = new JFrame();
        JLabel item1 = new JLabel("Unemployment 2020 Quarter 2");
        item1.setToolTipText("By Ogbonna Ikechukwu Innocent 17CJ022523");
        jframe.add(item1);
        
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(new FlowLayout());
        jframe.setSize(400,180);
        jframe.setVisible(true);
        JLabel item2 = new JLabel("1562528");
        jframe.add(item2);
        
        //myStates.setSelectedItem(null);
        //String msg = (String)myStates.getSelectedItem();
        //System.out.println(msg);
        //jframe.addMouseListener(true);
        
        
        jframe.add(myStates); 
        //System.out.println(new Handler());

// get the selected item:
       // String selectedBook = (String) stateList.getSelectedItem();
       

        // check whether the server is running or not
        System.out.println("Server is running: " + jedis.ping());
        //getting the percentage for each state
       
//        System.out.println((jedis.zrangeByScoreWithScores("names", 0, 1000).forEach(Tuple r:)}));
        // storing the data into redis database
       
        	//System.out.println(jedis.zrange("stuff", 0, 100));
        
        /*for (Map.Entry m : ((Map<String,Double>) scoreMembers).entrySet()) {
        	
            System.out.println(m.getKey() + " " + m.getValue());
        }*/
        
    }
    
    private static class Handler implements ItemListener{
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//           JOptionPane.showMessageDialog(null, String.format("%s", e.getActionCommand()));
//        }

        
             /*for (Map.Entry m : redisData.entrySet()) {
                 if(e.getItem().toString() == m.getValue()&& e.getStateChange() == 1){
                     
                     JOptionPane.showMessageDialog(null, m.getKey() + "%", "Percentage", 1);
                     System.out.println(m.getKey());
                     break;
                     
                 }*/
          //  System.out.println(m.getKey() + " " + m.getValue());

            //jedis.zadd("statistics", M)
        }
       //     System.out.println(e.getItem().toString());
        
    }
