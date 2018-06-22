package javaFX_GPR2015.model;

public class Traffic {
    private String segmentName;
    private Double segmentLength;
    private int carsTraffic;
    private int busesTraffic;
    private int deliveryTrucks;
    private int trucksNoTrailersTraffic;
    private int trucksWithTrailersTraffic;
    private int motorbikesTraffic;
    private int tractorsTraffic;
    private int sumTraffic;

    public Traffic(String segmentName, Double segmentLength, int carsTraffic, int busesTraffic, int deliveryTrucks, int trucksNoTrailersTraffic, int trucksWithTrailersTraffic, int motorbikesTraffic, int tractorsTraffic, int sumTraffic) {
        this.segmentName = segmentName;
        this.segmentLength = segmentLength;
        this.carsTraffic = carsTraffic;
        this.busesTraffic = busesTraffic;
        this.deliveryTrucks = deliveryTrucks;
        this.trucksNoTrailersTraffic = trucksNoTrailersTraffic;
        this.trucksWithTrailersTraffic = trucksWithTrailersTraffic;
        this.motorbikesTraffic = motorbikesTraffic;
        this.tractorsTraffic = tractorsTraffic;
        this.sumTraffic = sumTraffic;
    }

    public Traffic(String segmentName, Double segmentLength, int carsTraffic, int busesTraffic, int deliveryTrucks, int trucksNoTrailersTraffic, int trucksWithTrailersTraffic, int sumTraffic) {

        this.segmentName = segmentName;
        this.segmentLength = segmentLength;
        this.carsTraffic = carsTraffic;
        this.busesTraffic = busesTraffic;
        this.deliveryTrucks = deliveryTrucks;
        this.trucksNoTrailersTraffic = trucksNoTrailersTraffic;
        this.trucksWithTrailersTraffic = trucksWithTrailersTraffic;
        this.sumTraffic = sumTraffic;
    }

    public String getSegmentName() {
        return segmentName;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    public Double getSegmentLength() {
        return segmentLength;
    }

    public void setSegmentLength(Double segmentLength) {
        this.segmentLength = segmentLength;
    }

    public int getCarsTraffic() {
        return carsTraffic;
    }

    public void setCarsTraffic(int carsTraffic) {
        this.carsTraffic = carsTraffic;
    }

    public int getBusesTraffic() {
        return busesTraffic;
    }

    public void setBusesTraffic(int busesTraffic) {
        this.busesTraffic = busesTraffic;
    }

    public int getDeliveryTrucks() {
        return deliveryTrucks;
    }

    public void setDeliveryTrucks(int deliveryTrucks) {
        this.deliveryTrucks = deliveryTrucks;
    }

    public int getTrucksNoTrailersTraffic() {
        return trucksNoTrailersTraffic;
    }

    public void setTrucksNoTrailersTraffic(int trucksNoTrailersTraffic) {
        this.trucksNoTrailersTraffic = trucksNoTrailersTraffic;
    }

    public int getTrucksWithTrailersTraffic() {
        return trucksWithTrailersTraffic;
    }

    public void setTrucksWithTrailersTraffic(int trucksWithTrailersTraffic) {
        this.trucksWithTrailersTraffic = trucksWithTrailersTraffic;
    }

    public int getMotorbikesTraffic() {
        return motorbikesTraffic;
    }

    public void setMotorbikesTraffic(int motorbikesTraffic) {
        this.motorbikesTraffic = motorbikesTraffic;
    }

    public int getTractorsTraffic() {
        return tractorsTraffic;
    }

    public void setTractorsTraffic(int tractorsTraffic) {
        this.tractorsTraffic = tractorsTraffic;
    }

    public int getSumTraffic() {
        return sumTraffic;
    }

    public void setSumTraffic(int sumTraffic) {
        this.sumTraffic = sumTraffic;
    }

    @Override
    public String toString() {
        return "Traffic{" +
                "segmentName='" + segmentName + '\'' +
                ", segmentLength=" + segmentLength +
                ", carsTraffic=" + carsTraffic +
                ", busesTraffic=" + busesTraffic +
                ", deliveryTrucks=" + deliveryTrucks +
                ", trucksNoTrailersTraffic=" + trucksNoTrailersTraffic +
                ", trucksWithTrailersTraffic=" + trucksWithTrailersTraffic +
                ", motorbikesTraffic=" + motorbikesTraffic +
                ", tractorsTraffic=" + tractorsTraffic +
                ", sumTraffic=" + sumTraffic +
                '}';
    }
}
