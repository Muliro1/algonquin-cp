class Patient {
    private String name;
    private int ward;

    public Patient() {
        this.name = null;
        this.ward = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWard() {
        return ward;
    }

    public void setWard(int ward) {
        this.ward = ward;
    }
}