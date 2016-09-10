public class HomeWork5 {

        public static void main(String[] args) {
                String someText = "<div style=\"navigation\">Element blokowy</div>";
                String someText1 = "<h1>To jest header</h1>";
		String someText2 = "<p>To jest paragraf</p>"; 
                String cleanText = someText.replaceAll("<[^>]*>", "");
		String cleanText1 = someText1.replaceAll("<[^>]*>", "");
		String cleanText2 = someText2.replaceAll("<[^>]*>", "");
                System.out.println(cleanText + " " + cleanText1 + " " + cleanText2);
        }
}