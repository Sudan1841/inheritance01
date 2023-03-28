import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Apllp 
{

	public static void main(String[] args)
	
	{
		/*JFrame frame = new JFrame();
		frame.getContentPane().setBackground(new Color(210, 105, 30));
		frame.setBounds(100, 100, 1450, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		*/
		//JLabel label = new JLabel("Avater ");
		//label.setBackground(Color.ORANGE);
		
		// create three char human; elf; dwarf
		Abtar hum = new Abtar();
		HumanClass test1 = new HumanClass();
		HumanClass char1 = new HumanClass();
		Abtar elf = new Abtar();
		Abtar dwarf = new Abtar();
		
		//create the human char 
		hum.setName(" Patagonia");
		hum.setGender(" Male");
		hum.setApp(" scar on forehead");
		hum.setRace("human");
		hum.setAge(30);
		
		
		
		display(hum);
		
		char1.setName(" JOJO");
		char1.setGender("female");
		char1.setApp(" big Musclie and big eyes");
		char1.setRace("human");
		char1.setAge(22);
		
		
		char1.setName(" Lion");
		char1.setGender(" Male");
		char1.setApp("  it has huge thees ");
		char1.setRace("Animel");
		char1.setAge(15);
		char1.setLanguage(" French");
		char1.setWeapon(" Long Sword");
		char1.setAttribute(" +1 to Strngth");
		displayChild(char1);
		
		
		
		 display(test1);
		
		
		
		// displye cha
	}
			
	public static void  display(Abtar a)
		{
		
		JOptionPane.showMessageDialog(null, " your char name is "+ a.name+"\n your char is a "+a.gender
				+" \n that is "+a.getAge()+" years old "+"\n race is "+ a.race
				+" \n with a " +a.getApp());
		}
	
	public static void  displayChild(Abtar a)
		{
		
		JOptionPane.showMessageDialog(null, " your char name is "+ a.name+"\n your char is a "+a.gender
				+" \n that is "+a.getAge()+" years old "+"\n race is "+ a.race
				+" \n with a " +a.getApp());
			/*	
				+" \n another chr is::: !!!!!!!!!!!!!!!!!!!!!!!!"
				+"\n your char name is "+ elf.name+"\n your char is a "+elf.gender
				+" \n that is "+elf.getAge()+" years old "+"\n race is "+elf.race
				+" \n with a " +elf.getApp()
				
				+"\n another char is:::!!!!!!!!!!!!!!!!!!!!!!!!!!"
				+"\n your char name is "+ dwarf.name+"\n your char is a "+dwarf.gender
				+" \n that is "+dwarf.getAge()+" years old "+"\n race is "+dwarf.race
				+" \n with a " +dwarf.getApp());
*/
	}
	

}
