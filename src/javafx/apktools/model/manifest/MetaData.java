package javafx.apktools.model.manifest;

/**
 * AndroidManifest.xml meta-data便签包装
 */
public class MetaData {

    private String name;
    private String value;

    public MetaData(){

    }

    public MetaData(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return false;
        }
        if (obj instanceof MetaData) {
            MetaData md = (MetaData) obj;
            if (md.name == null || md.value == null) {
                return false;
            }
            if (md.name.equals(name) && md.value.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + value.hashCode();
    }
}
