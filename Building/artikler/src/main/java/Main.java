import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("http://www.uio.no/forskning/aktuelt/aktuelle-saker/").get();

		System.out.println("====== " + doc.title() + " ======");

		Elements titles = doc.select(".vrtx-title a");

		for (Element e : titles) {
			System.out.println(e.text());
		}
	}
}