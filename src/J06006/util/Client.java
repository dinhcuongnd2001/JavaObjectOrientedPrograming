
package J06006.util;

public class Client {
    private String id, name, gender, date , address ;

    public Client(int i, String name, String gender, String date, String address) {
        this.id = "KH" + String.format("%03d", i);
        this.name = name;
        this.gender = gender;
        String [] a = date.split("/");
        this.date = "";
        for(int x = 0 ; x < a.length - 1 ; x++){
            String mark = "";
            if(a[x].length() < 2){
                mark = "0" + a[x].charAt(0);
            }
            this.date = this.date + mark + "/";
        }
        this.date = this.date + a[a.length - 1];
        this.address = address;
    }
    public String getIdClient(){
        return this.id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    

    @Override
    public String toString() {
        return  name + " " + address ;
    }    
}