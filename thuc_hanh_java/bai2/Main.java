package bai2;

interface EmailSender {
    void sendEmail();
}
interface Programmer {
    void program();
}
interface Salesperson {
    void sell();
}
class OfficeEmployee implements EmailSender {
    private String name;

    public OfficeEmployee(String name) {
        this.name = name;
    }

    @Override
    public void sendEmail() {
        System.out.println( name + " (VP): Đang gửi email thông báo nội bộ...");
    }
}
class TechnicalEmployee implements EmailSender, Programmer {
    private String name;

    public TechnicalEmployee(String name) {
        this.name = name;
    }

    @Override
    public void sendEmail() {
        System.out.println( name + " (KT): Đang gửi email báo cáo tiến độ dự án...");
    }

    @Override
    public void program() {
        System.out.println( name + " (KT): Đang viết code và fix bug...");
    }
}

class SalesEmployee implements EmailSender, Salesperson {
    private String name;

    public SalesEmployee(String name) {
        this.name = name;
    }

    @Override
    public void sendEmail() {
        System.out.println( name + " (BH): Đang gửi email báo giá cho khách hàng...");
    }

    @Override
    public void sell() {
        System.out.println( name + " (BH): Đang tư vấn và chốt sale...");
    }
}

public class Main {
    public static void main(String[] args) {
        OfficeEmployee toan = new OfficeEmployee("toan");
        TechnicalEmployee phu = new TechnicalEmployee("phu");
        SalesEmployee mai = new SalesEmployee("mai");

        toan.sendEmail();
        phu.program();
        phu.sendEmail();
        mai.sell();
        mai.sendEmail();
    }
}