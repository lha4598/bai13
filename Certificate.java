import java.util.Date;

public class Certificate {
    private String certificateId;
    private String certificateName;
    private Date certificateDate;
    public Certificate(String certificateId, String certificateName, Date certificateDate) {
        this.certificateId = certificateId;
        this.certificateName = certificateName;
        this.certificateDate = certificateDate;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public Date getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(Date certificateDate) {
        this.certificateDate = certificateDate;
    }
}
