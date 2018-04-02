package sklep;


public abstract class Record extends Article implements Streamable {

    private long length;
    private String fileType;

    public long filesize() {
        return length;
    }

    public String fileType() {
        return fileType;
    }


    public Record(long length, String fileType) {
        this.length = length;
        this.fileType = fileType;
    }
}
