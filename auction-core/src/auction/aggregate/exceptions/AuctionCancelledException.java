package auction.aggregate.exceptions;

public class AuctionCancelledException extends Exception {
    public AuctionCancelledException(String message) {
        super(message);
    }
}
