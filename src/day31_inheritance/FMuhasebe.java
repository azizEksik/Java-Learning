package day31_inheritance;

public class FMuhasebe  extends EPersonel {

    protected String sgkNo="Calisan sgk no belirtilmedi";
    protected boolean raporluMu;

    protected void fazlaMesai(int fazlaMesaiSaati){
        System.out.println(fazlaMesaiSaati*200);
    }

    protected void nobetUcreti(int nobetSayisi){
        System.out.println(nobetSayisi*500);
    }
}
