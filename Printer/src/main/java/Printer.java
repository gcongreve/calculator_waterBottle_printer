public class Printer {
    private int paperRemaining;
    private int toner;

    public Printer(int paperRemaining){
        this.paperRemaining = paperRemaining;
        this.toner = 100;
    }



    public int getRemainingPaper() {

        return this.paperRemaining;
    }

    public void print(int pages, int copies){
        int totalPaper = pages * copies;
        if (totalPaper <= this.paperRemaining){
            this.paperRemaining -= totalPaper;
            this.toner -= totalPaper;
        }
    }

    public void addPaper(int paper) {
        this.paperRemaining += paper;
    }


    public int getToner() {
        return this.toner;
    }
}
