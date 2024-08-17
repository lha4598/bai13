public class Certificate {
    private String certificateId;
    private String certificateName;
    private String certificateDate;
    private String certificateRank;
    public Certificate(String certificateId, String certificateName, String certificateDate, String certificateRank) {
        this.certificateId = certificateId;
        this.certificateName = certificateName;
        this.certificateDate = certificateDate;
        this.certificateRank = certificateRank;
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

    public String getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(String certificateDate) {
        this.certificateDate = certificateDate;
    }

    public String getCertificateRank() {
        return certificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        this.certificateRank = certificateRank;
    }

    public String toString() {
        return "Certificate{" +
                "certificateId='" + certificateId + '\'' +
                ", certificateName='" + certificateName + '\'' +
                ", certificateDate='" + certificateDate + '\'' +
                ", certificateRank='" + certificateRank + '\'' +
                '}';
    }
}
