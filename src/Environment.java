public enum Environment {
    PROD("prod URL","1"),
    PREPROD("preprod URL", "2"),
    STAGE("stage URL", "3"),
    AUTOMATION("Automation URL", "4");

    public String getUrl() {
        return url;
    }


    public String getVersion() {
        return version;
    }


    private String url;
    private String version;
    Environment (String url, String version){
        this.url = url;
        this.version = version;
    }
}
