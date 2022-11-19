package co.com.choucair.pruebatecnica.model;

public class SignUpData {

    private String strComputerVersion;
    private String strComputerLanguage;
    private String strComputerOS;
    private String strCity;
    private String strZip;
    private String strCountry;
    private String strMobileOS;
    private String strMobileBrand;
    private String strMobileModel;
    private String strFirstName;
    private String strLastName;
    private String strBirthdayMonth;
    private String strBirthdayDay;
    private String strBirthdayYear;
    private String strEmail;
    private String strPassword;
    private String strPasswordConfirmation;

    public SignUpData(String parFirstName, String parLastName, String parBirthdayMonth, String parBirthdayDay, String parBirthdayYear, String parEmail, String parPassword, String parPasswordConfirmation, String parCity, String parZip, String parCountry, String parComputerOS, String parComputerVersion, String parComputerLanguage, String parMobileOS, String parMobileBrand, String parMobileModel) {
        this.strComputerVersion = parComputerVersion;
        this.strComputerLanguage = parComputerLanguage;
        this.strComputerOS = parComputerOS;
        this.strCity = parCity;
        this.strZip = parZip;
        this.strCountry = parCountry;
        this.strMobileOS = parMobileOS;
        this.strMobileBrand = parMobileBrand;
        this.strMobileModel = parMobileModel;
        this.strFirstName = parFirstName;
        this.strLastName = parLastName;
        this.strBirthdayMonth = parBirthdayMonth;
        this.strBirthdayDay = parBirthdayDay;
        this.strBirthdayYear = parBirthdayYear;
        this.strEmail = parEmail;
        this.strPassword = parPassword;
        this.strPasswordConfirmation = parPasswordConfirmation;
    }

    public String getStrPasswordConfirmation() {
        return strPasswordConfirmation;
    }

    public void setStrPasswordConfirmation(String strPasswordConfirmation) {
        this.strPasswordConfirmation = strPasswordConfirmation;
    }

    public String getStrComputerVersion() {
        return strComputerVersion;
    }

    public void setStrComputerVersion(String strComputerVersion) {
        this.strComputerVersion = strComputerVersion;
    }

    public String getStrComputerLanguage() {
        return strComputerLanguage;
    }

    public void setStrComputerLanguage(String strComputerLanguage) {
        this.strComputerLanguage = strComputerLanguage;
    }

    public String getStrComputerOS() {
        return strComputerOS;
    }

    public void setStrComputerOS(String strComputerOS) {
        this.strComputerOS = strComputerOS;
    }

    public String getStrCity() {
        return strCity;
    }

    public void setStrCity(String strCity) {
        this.strCity = strCity;
    }

    public String getStrZip() {
        return strZip;
    }

    public void setStrZip(String strZip) {
        this.strZip = strZip;
    }

    public String getStrCountry() {
        return strCountry;
    }

    public void setStrCountry(String strCountry) {
        this.strCountry = strCountry;
    }

    public String getStrMobileOS() {
        return strMobileOS;
    }

    public void setStrMobileOS(String strMobileOS) {
        this.strMobileOS = strMobileOS;
    }

    public String getStrMobileBrand() {
        return strMobileBrand;
    }

    public void setStrMobileBrand(String strMobileBrand) {
        this.strMobileBrand = strMobileBrand;
    }

    public String getStrMobileModel() {
        return strMobileModel;
    }

    public void setStrMobileModel(String strMobileModel) {
        this.strMobileModel = strMobileModel;
    }

    public String getStrFirstName() {
        return strFirstName;
    }

    public void setStrFirstName(String strFirstName) {
        this.strFirstName = strFirstName;
    }

    public String getStrLastName() {
        return strLastName;
    }

    public void setStrLastName(String strLastName) {
        this.strLastName = strLastName;
    }

    public String getStrBirthdayMonth() {
        return strBirthdayMonth;
    }

    public void setStrBirthdayMonth(String strBirthdayMonth) {
        this.strBirthdayMonth = strBirthdayMonth;
    }

    public String getStrBirthdayDay() {
        return strBirthdayDay;
    }

    public void setStrBirthdayDay(String strBirthdayDay) {
        this.strBirthdayDay = strBirthdayDay;
    }

    public String getStrBirthdayYear() {
        return strBirthdayYear;
    }

    public void setStrBirthdayYear(String strBirthdayYear) {
        this.strBirthdayYear = strBirthdayYear;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }
}
