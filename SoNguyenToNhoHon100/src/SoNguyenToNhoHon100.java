public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println("------ So Nguyen To Nho Hon 100 --------");

       int dem =0;// Khai bien chay bat dau tu 0

       for (int  i= 2 ; i< 101; i++) //Bien i chay bat dau tu 2
       {
           for (int j =1 ; j<=i; j++) //Chay bien j tu 1 va tang theo bien i
           {
               if (i%j ==0) //Neu i chia het cho j
                   dem ++; //bien diem se tang tu 0 len 1
           }
           if (dem==2)// Neu bien diem tang len va bang 2
           {
               System.out.println("So nguyen to la: "+ i); //in ra so nguyen to
           }
           dem =0;//bien diem bang so nguyen to
       }

    }
}
