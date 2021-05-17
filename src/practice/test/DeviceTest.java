/* this example shows function overloading */

package practice.test;

import core.java.practice.Device;

import java.util.Scanner;

public class DeviceTest {
    public static void main(String  args[])
    {
        String name = null;

        String email = null ;
       int  webex_id ;

        Device d = new Device();
                   // setCommunicationDetails if user is using email
       d.setCommunicationDetails("vikrant","vvvv@gmail.com");
        System.out.println(d.getName()+" is communicates with email id . Communicate with email id :"+ d.getEmail());

              // setCommunicationDetails if user is using webex_id
       d.setCommunicationDetails("vikrant tiwari",784);
       System.out.println("*******************************************\n ***********************");
        System.out.println(d.getName()+" is using mobile phone only . Communicate with  webex id :"+ d.getWebexID());

    }
}
