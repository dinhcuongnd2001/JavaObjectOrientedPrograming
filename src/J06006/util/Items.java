
package J06006.util;

public class Items {
    private String id, name, unit;
    private long inPay , outPay ;

    public Items(int i, String name, String unit, long inPay, long outPay) {
        this.id = "MH" + String.format("%03d", i);
        this.name = name;
        this.unit = unit;
        this.inPay = inPay;
        this.outPay = outPay;
    }
    public String getIdItems(){
        return this.id;
    }
    public long getOutPay(){
        return this.outPay;
    }
    public long getInPay(){
        return this.inPay;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name ;
    }
    
}
