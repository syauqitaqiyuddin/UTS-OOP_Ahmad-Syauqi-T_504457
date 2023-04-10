public class Main {
    public static void main(String[] args) {
        Chart pieChart = new Chart();
        pieChart.addChart(new Subject("IPA", 25.0));
        pieChart.addChart(new Subject("B.Indonesia", 75.0));
        System.out.println(pieChart);
//        pieChart.addChart(new Subject("Matematika", 50.0));
        System.out.println(pieChart);
    }
}
// expected output :
//    current PieChart :
//    25.0% Sains
//    75.0% Bahasa Indonesia
//
//    Current Pie Chart :
//    10.0% IPA
//    30.0% B.Indonesia
//    60.0% B.ing