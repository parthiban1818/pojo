package assinment;

import java.util.Scanner;

public class Binary { 
	public static void main(String[] args) {
		  Pojo p=new Pojo();
		  p.setName("parthiban");
		  p.setAge(21);
		  p.setMailId("parthiban@gmail.com");
		  p.setGender("male");
		  p.setMoblie(6381195727l);
		  p.setReg_no(123456);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getMailId());
        System.out.println(p.getGender());
        System.out.println(p.getMoblie());
        System.out.println(p.getReg_no());
	} 
}
