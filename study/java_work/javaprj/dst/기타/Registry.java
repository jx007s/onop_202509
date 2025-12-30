package util_p;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.io.File;

public class Registry {
	public static void main(String[] args) throws Exception {

		String[] index = { "id", "pw", "pwÈ®ÀÎ", "¼º¸í", "ÀÌ¸ŞÀÏ", "ÀüÈ­¹øÈ£", "ÇÚµåÆù", "ÁÖ¹Î¹øÈ£", "»çÁøÃ·ºÎ", "¿ìÆí¹øÈ£°Ë»ö" };

		String[][] dis = { { "¼ºµ¿±¸", "100-010" }, { "Áß¶û±¸", "200-010" }, { "³ë¿ø±¸", "300-010" }, { "¼ÛÆÄ±¸", "400-010" } };

		String dd = "¤¡¤¤¤§¤©¤±¤²¤µ¤·¤¸¤º¤»¤¼¤½¤¾", ss = "°¡³ª´Ù¶ó¸¶¹Ù»ç¾ÆÀÚÂ÷Ä«Å¸ÆÄÇÏ", ee = "ƒ‰ˆ¢‹L¡“J•½šïŸç£ ¯†µi»MÀ˜ÆR";
		Scanner sc = new Scanner(new File("fff/qqq.csv"));
		String pwChk = "";

		String[][] chk = { { "id", "[a-zA-Z]+[0-9a-zA-Z]*", "¾µ ¼ö ¾ø´Â id" }, { "¼º¸í", "[°¡-ÆR]+", "À¯È¿ÇÏÁö ¾ÊÀº ÀÌ¸§" },
				{ "ÀÌ¸ŞÀÏ", "[0-9a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]+", "À¯È¿ÇÏÁö ¾ÊÀº ÀÌ¸ŞÀÏ ÁÖ¼Ò" },
				{ "ÇÚµåÆù", "[0-9]{3}-[0-9]{4}-[0-9]{4}", "À¯È¿ÇÏÁö ¾ÊÀº ÇÚµåÆù¹øÈ£" },
				{ "ÀüÈ­¹øÈ£", "[0-9]{2,3}-[0-9]{3}-[0-9]{4}", "À¯È¿ÇÏÁö ¾ÊÀº ÀüÈ­¹øÈ£" },
				{ "ÁÖ¹Î¹øÈ£", "[0-9]{6}-[0-9]{7}", "À¯È¿ÇÏÁö ¾ÊÀº ÁÖ¹Î¹øÈ£" },
				{ "»çÁøÃ·ºÎ", "[0-9a-z]+[.](jpg|bmp|jpeg|png|gif)", "À¯È¿ÇÏÁö ¾ÊÀº ÆÄÀÏÀÌ¸§ ¶Ç´Â È®ÀåÀÚ" }
				// {"pwÈ®ÀÎ",pwChk,"ºñ¹Ğ¹øÈ£ ºÒÀÏÄ¡"}pwChkÀÇ ÁÖ¼Ò°¡ ¾Æ´Ï¶ó °ªÀÌ¶ó ¾ÈµÇ´ÂµíÇÕ´Ï´Ù
		};

		A: while (sc.hasNextLine()) { // ÀüÃ¼
			int cnt = 0;
			String input = "";
			input = sc.nextLine();
			StringTokenizer stk = new StringTokenizer(input, ",");

			B: while (stk.hasMoreTokens()) { // À¯ÀúÇÑ¸í
				try {
					String buf = stk.nextToken();

					if (index[cnt].equals("pw")) {
						pwChk = buf;
					}

					if (index[cnt].equals("pwÈ®ÀÎ") && !pwChk.equals(buf)) {
						throw new Exception("pw ºÒÀÏÄ¡" + " : " + buf);
					}

					for (String[] c : chk) {
						String chkTmp = index[cnt].equals("»çÁøÃ·ºÎ") ? buf.toLowerCase() : buf; // ÆÄÀÏ,È®ÀåÀÚ¸í ´ë¼Ò¹®ÀÚ »ó°ü¾øÀÌ
						if (index[cnt].equals(c[0]) && !Pattern.matches(c[1], chkTmp)) {
							throw new Exception(c[2] + " : " + buf);
						}
					}

					if (index[cnt].equals("¿ìÆí¹øÈ£°Ë»ö")) {
						boolean find = false;
						String pp = "";
						for (int i1 = 0; i1 < buf.length(); i1++) {
							int num = dd.indexOf("" + buf.charAt(i1));
							if (num == -1) {
								pp += "[" + buf.charAt(i1) + "]";
							} else {
								pp += "[" + buf.charAt(i1) + "|" + ss.charAt(num) + "-" + ee.charAt(num) + "]";
							}
						}

						for (String[] str : dis) {
							if (Pattern.matches(pp, str[0])) {
								find = true;
								buf += " ==> " + str[0] + " " + str[1];
							}
						}
						if (!find) {
							throw new Exception("¾ø´Â Áö¿ª±¸" + " : " + buf);
						}
					}
					System.out.println(index[cnt] + " : " + buf);
					cnt++;

				} catch (Exception e) {

					// TODO: handle exception
					System.out.println("È¸¿ø°¡ÀÔ ½ÇÆĞ ==> " + e.getMessage());
					cnt = 0;
					break B;
				}
			}
			System.out.println();
		}

	}
}
