package fine.koaca.fineworksupportmanagement;

public class InOutStockList {
    String date;
    String in;
    String out;
    String stock;
    String remark;

    public InOutStockList(String date, String in, String out, String stock, String remark) {
        this.date = date;
        this.in = in;
        this.out = out;
        this.stock = stock;
        this.remark = remark;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
