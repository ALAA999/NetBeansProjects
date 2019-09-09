
public class custmer {

    String id;
    String name;
    String date;
    String contract_type;


    public custmer(String id, String name, String date, String contract_type) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.contract_type = contract_type;
    }

    public String getContract_type() {
        return contract_type;
    }

    public void setContract_type(String contract_type) {
        this.contract_type = contract_type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;

    }

}
