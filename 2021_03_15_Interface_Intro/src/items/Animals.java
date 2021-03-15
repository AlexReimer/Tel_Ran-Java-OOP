package items;

public abstract class Animals {
    String kind;
    String subspscies;

    public Animals(String kind, String subspscies) {
        this.kind = kind;
        this.subspscies = subspscies;
    }

    public Animals() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getSubspscies() {
        return subspscies;
    }

    public void setSubspscies(String subspscies) {
        this.subspscies = subspscies;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "kind='" + kind + '\'' +
                ", subspscies='" + subspscies + '\'' +
                '}';
    }
}
