package request;

public class Request {
  private boolean creditAvailable;
  private double monthlyIncome;
  private double loanAmount;
  private boolean hasCreditIssues;
  private boolean hasCollateral;

  public Request(double loanAmount, double monthlyIncome, boolean creditAvailable, boolean hasCreditIssues) {
    this.loanAmount = loanAmount;
    this.monthlyIncome = monthlyIncome;
    this.creditAvailable = creditAvailable;
    this.hasCreditIssues = hasCreditIssues;
  }

  public boolean hasCollateral() {
    return hasCollateral;
  }

  public void setCollateral(boolean hasCollateral) {
    this.hasCollateral = hasCollateral;
  }

  public boolean hasCreditIssues() {
    return hasCreditIssues;
  }

  public void setCreditIssues(boolean hasCreditIssues) {
    this.hasCreditIssues = hasCreditIssues;
  }

  public double getLoanAmount() {
    return loanAmount;
  }

  public void setLoanAmount(double loanAmount) {
    this.loanAmount = loanAmount;
  }

  public double getMonthlyIncome() {
    return monthlyIncome;
  }

  public void setMonthlyIncome(double monthlyIncome) {
    this.monthlyIncome = monthlyIncome;
  }

  public boolean isCreditAvailable() {
    return creditAvailable;
  }

  public void setCreditAvailable(boolean creditAvailable) {
    this.creditAvailable = creditAvailable;
  }

}