class pieChart extends Chart{
        @Override
        public String getCurrentChart() {
            double totalPercentage = subjects.stream().mapToDouble(Subject::getPercentage).sum();
            StringBuilder builder = new StringBuilder("current PieChart : ");
            for (Subject subject : subjects) {
                builder.append(String.format("%.1f%% %s ", subject.getPercentage(), subject.getName()));
            }
            builder.append(String.format("(Total %.1f%%)", totalPercentage));
            return builder.toString();
        }
}


