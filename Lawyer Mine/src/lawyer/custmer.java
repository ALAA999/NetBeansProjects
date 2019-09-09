/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Design
 */
public class custmer {

    String id;
    String name;
   String BuierName;
    String date;
    String contract_type;
String note;

    public custmer(String id, String name, String date, String contract_type,String BuierName,String note) {
        this.id = id;
        this.name = name;
        this.note=note;
        this.date = date;
        this.BuierName=BuierName;
        this.contract_type = contract_type;
    }

    public String getBuierName() {
        return BuierName;
    }

    public void setBuierName(String BuierName) {
        this.BuierName = BuierName;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}

