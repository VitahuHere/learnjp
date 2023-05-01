package com.vitah.learnjp.model;

import com.vitah.learnjp.repository.EnglishRepository;
import com.vitah.learnjp.repository.HiraganaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LangConfig {
    @Bean
    CommandLineRunner commandLineRunner(EnglishRepository englishRepository, HiraganaRepository hiraganaRepository) {
        return args -> {
            Hiragana hiragana_a = new Hiragana("あ", "a");
            Hiragana hiragana_i = new Hiragana("い", "i");
            Hiragana hiragana_u = new Hiragana("う", "u");
            Hiragana hiragana_e = new Hiragana("え", "e");
            Hiragana hiragana_o = new Hiragana("お", "o");
            Hiragana hiragana_ka = new Hiragana("か", "ka");
            Hiragana hiragana_ki = new Hiragana("き", "ki");
            Hiragana hiragana_ku = new Hiragana("く", "ku");
            Hiragana hiragana_ke = new Hiragana("け", "ke");
            Hiragana hiragana_ko = new Hiragana("こ", "ko");
            Hiragana hiragana_sa = new Hiragana("さ", "sa");
            Hiragana hiragana_shi = new Hiragana("し", "shi");
            Hiragana hiragana_su = new Hiragana("す", "su");
            Hiragana hiragana_se = new Hiragana("せ", "se");
            Hiragana hiragana_so = new Hiragana("そ", "so");
            Hiragana hiragana_ta = new Hiragana("た", "ta");
            Hiragana hiragana_chi = new Hiragana("ち", "chi");
            Hiragana hiragana_tsu = new Hiragana("つ", "tsu");
            Hiragana hiragana_te = new Hiragana("て", "te");
            Hiragana hiragana_to = new Hiragana("と", "to");
            Hiragana hiragana_na = new Hiragana("な", "na");
            Hiragana hiragana_ni = new Hiragana("に", "ni");
            Hiragana hiragana_nu = new Hiragana("ぬ", "nu");
            Hiragana hiragana_ne = new Hiragana("ね", "ne");
            Hiragana hiragana_no = new Hiragana("の", "no");
            Hiragana hiragana_ha = new Hiragana("は", "ha");
            Hiragana hiragana_hi = new Hiragana("ひ", "hi");
            Hiragana hiragana_hu = new Hiragana("ふ", "hu");
            Hiragana hiragana_he = new Hiragana("へ", "he");
            Hiragana hiragana_ho = new Hiragana("ほ", "ho");
            Hiragana hiragana_ma = new Hiragana("ま", "ma");
            Hiragana hiragana_mi = new Hiragana("み", "mi");
            Hiragana hiragana_mu = new Hiragana("む", "mu");
            Hiragana hiragana_me = new Hiragana("め", "me");
            Hiragana hiragana_mo = new Hiragana("も", "mo");
            Hiragana hiragana_ya = new Hiragana("や", "ya");
            Hiragana hiragana_yu = new Hiragana("ゆ", "yu");
            Hiragana hiragana_yo = new Hiragana("よ", "yo");
            Hiragana hiragana_ra = new Hiragana("ら", "ra");
            Hiragana hiragana_ri = new Hiragana("り", "ri");
            Hiragana hiragana_ru = new Hiragana("る", "ru");
            Hiragana hiragana_re = new Hiragana("れ", "re");
            Hiragana hiragana_ro = new Hiragana("ろ", "ro");
            Hiragana hiragana_wa = new Hiragana("わ", "wa");
            Hiragana hiragana_wo = new Hiragana("を", "wo");
            Hiragana hiragana_n = new Hiragana("ん", "n");
            Hiragana hiragana_ga = new Hiragana("が", "ga");
            Hiragana hiragana_gi = new Hiragana("ぎ", "gi");
            Hiragana hiragana_gu = new Hiragana("ぐ", "gu");
            Hiragana hiragana_ge = new Hiragana("げ", "ge");
            Hiragana hiragana_go = new Hiragana("ご", "go");
            Hiragana hiragana_za = new Hiragana("ざ", "za");
            Hiragana hiragana_ji = new Hiragana("じ", "ji");
            Hiragana hiragana_zu = new Hiragana("ず", "zu");
            Hiragana hiragana_ze = new Hiragana("ぜ", "ze");
            Hiragana hiragana_zo = new Hiragana("ぞ", "zo");
            Hiragana hiragana_da = new Hiragana("だ", "da");
            Hiragana hiragana_chi_ji = new Hiragana("ぢ", "chi ji");
            Hiragana hiragana_tsu_zu = new Hiragana("づ", "tsu zu");
            Hiragana hiragana_de = new Hiragana("で", "de");
            Hiragana hiragana_do = new Hiragana("ど", "do");
            Hiragana hiragana_ba = new Hiragana("ば", "ba");
            Hiragana hiragana_bi = new Hiragana("び", "bi");
            Hiragana hiragana_bu = new Hiragana("ぶ", "bu");
            Hiragana hiragana_be = new Hiragana("べ", "be");
            Hiragana hiragana_bo = new Hiragana("ぼ", "bo");
            Hiragana hiragana_pa = new Hiragana("ぱ", "pa");
            Hiragana hiragana_pi = new Hiragana("ぴ", "pi");
            Hiragana hiragana_pu = new Hiragana("ぷ", "pu");
            Hiragana hiragana_pe = new Hiragana("ぺ", "pe");
            Hiragana hiragana_po = new Hiragana("ぽ", "po");
            Hiragana hiragana_kya = new Hiragana("きゃ", "kya");
            Hiragana hiragana_kyu = new Hiragana("きゅ", "kyu");
            Hiragana hiragana_kyo = new Hiragana("きょ", "kyo");
            Hiragana hiragana_sha = new Hiragana("しゃ", "sha");
            Hiragana hiragana_shu = new Hiragana("しゅ", "shu");
            Hiragana hiragana_sho = new Hiragana("しょ", "sho");
            Hiragana hiragana_cha = new Hiragana("ちゃ", "cha");
            Hiragana hiragana_chu = new Hiragana("ちゅ", "chu");
            Hiragana hiragana_cho = new Hiragana("ちょ", "cho");
            Hiragana hiragana_nya = new Hiragana("にゃ", "nya");
            Hiragana hiragana_nyu = new Hiragana("にゅ", "nyu");
            Hiragana hiragana_nyo = new Hiragana("にょ", "nyo");
            Hiragana hiragana_hya = new Hiragana("ひゃ", "hya");
            Hiragana hiragana_hyu = new Hiragana("ひゅ", "hyu");
            Hiragana hiragana_hyo = new Hiragana("ひょ", "hyo");
            Hiragana hiragana_mya = new Hiragana("みゃ", "mya");
            Hiragana hiragana_myu = new Hiragana("みゅ", "myu");
            Hiragana hiragana_myo = new Hiragana("みょ", "myo");
            Hiragana hiragana_rya = new Hiragana("りゃ", "rya");
            Hiragana hiragana_ryu = new Hiragana("りゅ", "ryu");
            Hiragana hiragana_ryo = new Hiragana("りょ", "ryo");
            Hiragana hiragana_gya = new Hiragana("ぎゃ", "gya");
            Hiragana hiragana_gyu = new Hiragana("ぎゅ", "gyu");
            Hiragana hiragana_gyo = new Hiragana("ぎょ", "gyo");
            Hiragana hiragana_ja = new Hiragana("じゃ", "ja");
            Hiragana hiragana_ju = new Hiragana("じゅ", "ju");
            Hiragana hiragana_jo = new Hiragana("じょ", "jo");
            Hiragana hiragana_bya = new Hiragana("びゃ", "bya");
            Hiragana hiragana_byu = new Hiragana("びゅ", "byu");
            Hiragana hiragana_byo = new Hiragana("びょ", "byo");
            Hiragana hiragana_pya = new Hiragana("ぴゃ", "pya");
            Hiragana hiragana_pyu = new Hiragana("ぴゅ", "pyu");
            Hiragana hiragana_pyo = new Hiragana("ぴょ", "pyo");

            hiraganaRepository.saveAll(
                    List.of(
                            hiragana_a,
                            hiragana_i,
                            hiragana_u,
                            hiragana_e,
                            hiragana_o,
                            hiragana_ka,
                            hiragana_ki,
                            hiragana_ku,
                            hiragana_ke,
                            hiragana_ko,
                            hiragana_sa,
                            hiragana_shi,
                            hiragana_su,
                            hiragana_se,
                            hiragana_so,
                            hiragana_ta,
                            hiragana_chi,
                            hiragana_tsu,
                            hiragana_te,
                            hiragana_to,
                            hiragana_na,
                            hiragana_ni,
                            hiragana_nu,
                            hiragana_ne,
                            hiragana_no,
                            hiragana_ha,
                            hiragana_hi,
                            hiragana_hu,
                            hiragana_he,
                            hiragana_ho,
                            hiragana_ma,
                            hiragana_mi,
                            hiragana_mu,
                            hiragana_me,
                            hiragana_mo,
                            hiragana_ya,
                            hiragana_yu,
                            hiragana_yo,
                            hiragana_ra,
                            hiragana_ri,
                            hiragana_ru,
                            hiragana_re,
                            hiragana_ro,
                            hiragana_wa,
                            hiragana_wo,
                            hiragana_n,
                            hiragana_ga,
                            hiragana_gi,
                            hiragana_gu,
                            hiragana_ge,
                            hiragana_go,
                            hiragana_za,
                            hiragana_ji,
                            hiragana_zu,
                            hiragana_ze,
                            hiragana_zo,
                            hiragana_da,
                            hiragana_chi_ji,
                            hiragana_tsu_zu,
                            hiragana_de,
                            hiragana_do,
                            hiragana_ba,
                            hiragana_bi,
                            hiragana_bu,
                            hiragana_be,
                            hiragana_bo,
                            hiragana_pa,
                            hiragana_pi,
                            hiragana_pu,
                            hiragana_pe,
                            hiragana_po,
                            hiragana_kya,
                            hiragana_kyu,
                            hiragana_kyo,
                            hiragana_sha,
                            hiragana_shu,
                            hiragana_sho,
                            hiragana_cha,
                            hiragana_chu,
                            hiragana_cho,
                            hiragana_nya,
                            hiragana_nyu,
                            hiragana_nyo,
                            hiragana_hya,
                            hiragana_hyu,
                            hiragana_hyo,
                            hiragana_mya,
                            hiragana_myu,
                            hiragana_myo,
                            hiragana_rya,
                            hiragana_ryu,
                            hiragana_ryo,
                            hiragana_gya,
                            hiragana_gyu,
                            hiragana_gyo,
                            hiragana_ja,
                            hiragana_ju,
                            hiragana_jo,
                            hiragana_bya,
                            hiragana_byu,
                            hiragana_byo,
                            hiragana_pya,
                            hiragana_pyu,
                            hiragana_pyo
                    )
            );

            englishRepository.saveAll(
                    List.of(
                            new English("a", "sign for a", hiragana_a),
                            new English("i", "sign for i", hiragana_i),
                            new English("u", "sign for u", hiragana_u),
                            new English("e", "sign for e", hiragana_e),
                            new English("o", "sign for o", hiragana_o),
                            new English("ka", "sign for ka", hiragana_ka),
                            new English("ki", "sign for ki", hiragana_ki),
                            new English("ku", "sign for ku", hiragana_ku),
                            new English("ke", "sign for ke", hiragana_ke),
                            new English("ko", "sign for ko", hiragana_ko),
                            new English("sa", "sign for sa", hiragana_sa),
                            new English("shi", "sign for shi", hiragana_shi),
                            new English("su", "sign for su", hiragana_su),
                            new English("se", "sign for se", hiragana_se),
                            new English("so", "sign for so", hiragana_so),
                            new English("ta", "sign for ta", hiragana_ta),
                            new English("chi", "sign for chi", hiragana_chi),
                            new English("tsu", "sign for tsu", hiragana_tsu),
                            new English("te", "sign for te", hiragana_te),
                            new English("to", "sign for to", hiragana_to),
                            new English("na", "sign for na", hiragana_na),
                            new English("ni", "sign for ni", hiragana_ni),
                            new English("nu", "sign for nu", hiragana_nu),
                            new English("ne", "sign for ne", hiragana_ne),
                            new English("no", "sign for no", hiragana_no),
                            new English("ha", "sign for ha", hiragana_ha),
                            new English("hi", "sign for hi", hiragana_hi),
                            new English("hu", "sign for hu", hiragana_hu),
                            new English("he", "sign for he", hiragana_he),
                            new English("ho", "sign for ho", hiragana_ho),
                            new English("ma", "sign for ma", hiragana_ma),
                            new English("mi", "sign for mi", hiragana_mi),
                            new English("mu", "sign for mu", hiragana_mu),
                            new English("me", "sign for me", hiragana_me),
                            new English("mo", "sign for mo", hiragana_mo),
                            new English("ya", "sign for ya", hiragana_ya),
                            new English("yu", "sign for yu", hiragana_yu),
                            new English("yo", "sign for yo", hiragana_yo),
                            new English("ra", "sign for ra", hiragana_ra),
                            new English("ri", "sign for ri", hiragana_ri),
                            new English("ru", "sign for ru", hiragana_ru),
                            new English("re", "sign for re", hiragana_re),
                            new English("ro", "sign for ro", hiragana_ro),
                            new English("wa", "sign for wa", hiragana_wa),
                            new English("wo", "sign for wo", hiragana_wo),
                            new English("n", "sign for n", hiragana_n),
                            new English("ga", "sign for ga", hiragana_ga),
                            new English("gi", "sign for gi", hiragana_gi),
                            new English("gu", "sign for gu", hiragana_gu),
                            new English("ge", "sign for ge", hiragana_ge),
                            new English("go", "sign for go", hiragana_go),
                            new English("za", "sign for za", hiragana_za),
                            new English("ji", "sign for ji", hiragana_ji),
                            new English("zu", "sign for zu", hiragana_zu),
                            new English("ze", "sign for ze", hiragana_ze),
                            new English("zo", "sign for zo", hiragana_zo),
                            new English("da", "sign for da", hiragana_da),
                            new English("chi ji", "sign for chi ji", hiragana_chi_ji),
                            new English("tsu zu", "sign for tsu zu", hiragana_tsu_zu),
                            new English("de", "sign for de", hiragana_de),
                            new English("do", "sign for do", hiragana_do),
                            new English("ba", "sign for ba", hiragana_ba),
                            new English("bi", "sign for bi", hiragana_bi),
                            new English("bu", "sign for bu", hiragana_bu),
                            new English("be", "sign for be", hiragana_be),
                            new English("bo", "sign for bo", hiragana_bo),
                            new English("pa", "sign for pa", hiragana_pa),
                            new English("pi", "sign for pi", hiragana_pi),
                            new English("pu", "sign for pu", hiragana_pu),
                            new English("pe", "sign for pe", hiragana_pe),
                            new English("po", "sign for po", hiragana_po),
                            new English("kya", "sign for kya", hiragana_kya),
                            new English("kyu", "sign for kyu", hiragana_kyu),
                            new English("kyo", "sign for kyo", hiragana_kyo),
                            new English("sha", "sign for sha", hiragana_sha),
                            new English("shu", "sign for shu", hiragana_shu),
                            new English("sho", "sign for sho", hiragana_sho),
                            new English("cha", "sign for cha", hiragana_cha),
                            new English("chu", "sign for chu", hiragana_chu),
                            new English("cho", "sign for cho", hiragana_cho),
                            new English("nya", "sign for nya", hiragana_nya),
                            new English("nyu", "sign for nyu", hiragana_nyu),
                            new English("nyo", "sign for nyo", hiragana_nyo),
                            new English("hya", "sign for hya", hiragana_hya),
                            new English("hyu", "sign for hyu", hiragana_hyu),
                            new English("hyo", "sign for hyo", hiragana_hyo),
                            new English("mya", "sign for mya", hiragana_mya),
                            new English("myu", "sign for myu", hiragana_myu),
                            new English("myo", "sign for myo", hiragana_myo),
                            new English("rya", "sign for rya", hiragana_rya),
                            new English("ryu", "sign for ryu", hiragana_ryu),
                            new English("ryo", "sign for ryo", hiragana_ryo),
                            new English("gya", "sign for gya", hiragana_gya),
                            new English("gyu", "sign for gyu", hiragana_gyu),
                            new English("gyo", "sign for gyo", hiragana_gyo),
                            new English("ja", "sign for ja", hiragana_ja),
                            new English("ju", "sign for ju", hiragana_ju),
                            new English("jo", "sign for jo", hiragana_jo),
                            new English("bya", "sign for bya", hiragana_bya),
                            new English("byu", "sign for byu", hiragana_byu),
                            new English("byo", "sign for byo", hiragana_byo),
                            new English("pya", "sign for pya", hiragana_pya),
                            new English("pyu", "sign for pyu", hiragana_pyu),
                            new English("pyo", "sign for pyo", hiragana_pyo)
                    )
            );
        };
    }
}
