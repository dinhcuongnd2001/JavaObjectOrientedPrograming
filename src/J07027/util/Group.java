package J07027.util;

public class Group implements Comparable<Group>{
    private int numSeri;
    private Students s ;
    private Topic t;

    public Group(String id, int numSeri) {
        this.s= new Students(id, "", "");
        this.numSeri = numSeri;
        this.t = new Topic(Topic.getTopic(this.numSeri));
    }

    public void setS(Students s) {
        this.s = s;
    }

    public Students getS() {
        return s;
    }

    @Override
    public String toString() {
        return  s.getId()+ " " + s.getName() + " " + s.getPhoneNum() + " " + numSeri+ " " + this.t.getNameTopic();
    }

    @Override
    public int compareTo(Group o) {
        return this.s.getId().compareTo(o.s.getId());
    }
    
}
