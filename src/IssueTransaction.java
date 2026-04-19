class IssueTransaction {

    int transactionId;
    int lateDays;

    public IssueTransaction(int transactionId, int lateDays) {
        this.transactionId = transactionId;
        this.lateDays = lateDays;
    }

    int calculateFine() {
        if (lateDays <= 0) return 0;
        return lateDays * 5;
    }
}