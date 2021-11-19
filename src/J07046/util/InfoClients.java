
package J07046.util;

import java.util.*;
import java.text.*;
public class InfoClients implements Comparable<InfoClients>{
    private String id, name, idRoom;
    private long totalDay;
    private Date dayIn, dayOut;
    
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    public InfoClients(int i, String name, String idRoom, String dayIn, String dayOut) throws ParseException {
        this.id = "KH"+ String.format("%02d", i);
        this.name = name;
        this.idRoom = idRoom;
        this.dayIn = format.parse(dayIn);
        this.dayOut = format.parse(dayOut);
        this.totalDay = (this.dayOut.getTime() - this.dayIn.getTime() )/(60*60*24*1000);     
    }

    @Override
    public String toString() {
        return id + " " + name + " " + idRoom + " " + totalDay ;
    }

    @Override
    public int compareTo(InfoClients o) {
        if(this.totalDay < o.totalDay) return 1;
        return -1;
    }
}
