package auction.aggregate.exceptions;

public class AuctionEndedException extends Exception {
    public AuctionEndedException(String message) {
        super(message);
    }
}
