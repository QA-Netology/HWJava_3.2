public class BmiService {
    public int calculate (int growth , int weight) {
        int bodyMassIndex = growth / weight;
        return bodyMassIndex;
    }
}
