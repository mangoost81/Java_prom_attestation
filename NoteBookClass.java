/**
 * NoteBook
 */
public class NoteBookClass {

    private String brandOfcpu;
    private int valueOfOperativ;
    private int diagonal;
    private int valueOfSsd;
    private String brand;

    public NoteBookClass(String brandOfcpu, int valueOfOperativ, int diagonal, 
    int valueOfSsd, String brand) {
        this.brandOfcpu = brandOfcpu;
        this.valueOfOperativ = valueOfOperativ;
        this.diagonal = diagonal;
        this.valueOfSsd = valueOfSsd;
        this.brand = brand;

    }
    public String getBrandOfCpu() {
        return brandOfcpu;
    }

    public int getValueOfOperativ() {
        return valueOfOperativ;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public int getValueOfSsd() {
        return valueOfSsd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrandOfCpu(String brandOfcpu){
        this.brandOfcpu = brandOfcpu;
    }

    public void setValueOfOperativ(int valueOfOperativ) {
        this.valueOfOperativ = valueOfOperativ;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public void valueOfSsd(int valueOfSsd) {
        this.valueOfSsd = valueOfSsd;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Наименование процессора: " + brandOfcpu + "." + " Обьем оперативной памяти: " + valueOfOperativ
        + " гигабайт." + " Диагональ экрана: " + diagonal +" дюймов." + " Обьем жесткого диска: " + valueOfSsd + " гигабайт." + " Производитель: " + brand + ".";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brandOfcpu == null) ? 0 : brandOfcpu.hashCode());
        result = prime * result + valueOfOperativ;
        result = prime * result + diagonal;
        result = prime * result + valueOfSsd;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        NoteBookClass other = (NoteBookClass) obj;
        if (brandOfcpu == null) {
            if (other.brandOfcpu != null)
                return false;
        } else if (!brandOfcpu.equals(other.brandOfcpu))
            return false;
        if (valueOfOperativ != other.valueOfOperativ)
            return false;
        if (diagonal != other.diagonal)
            return false;
        if (valueOfSsd != other.valueOfSsd)
            return false;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        return true;
    }

    
}