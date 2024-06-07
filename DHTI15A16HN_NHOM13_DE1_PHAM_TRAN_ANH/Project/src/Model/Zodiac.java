package Model;

public class Zodiac {

    private int day;
    private int month;

    public Zodiac() {
    }

    public Zodiac(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String CHD() {
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Cung Bạch Dương (21/3 - 19/4)\n" +
                   "Biểu tượng: ♈ Con cừu\n" +
                   "Nguyên tố: Lửa\n" +
                   "Hành tinh cai quản: Sao Hỏa\n" +
                   "Đặc điểm nổi bật: Năng động, dũng cảm, tự tin, thích cạnh tranh.\n" +
                   "Khuyết điểm: Nóng nảy, thiếu kiên nhẫn, bốc đồng.";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Cung Kim Ngưu (20/4 - 20/5)\n" +
                   "Biểu tượng: ♉ Con bò\n" +
                   "Nguyên tố: Đất\n" +
                   "Hành tinh cai quản: Sao Kim\n" +
                   "Đặc điểm nổi bật: Kiên nhẫn, đáng tin cậy, thực tế, yêu thiên nhiên.\n" +
                   "Khuyết điểm: Bướng bỉnh, bảo thủ, thích sở hữu.";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 21)) {
            return "Cung Song Tử (21/5 - 20/6)\n" +
                   "Biểu tượng: ♊ Cặp song sinh\n" +
                   "Nguyên tố: Khí\n" +
                   "Hành tinh cai quản: Sao Thủy\n" +
                   "Đặc điểm nổi bật: Thông minh, linh hoạt, giao tiếp tốt, tò mò.\n" +
                   "Khuyết điểm: Không kiên định, thiếu tập trung, dễ thay đổi.";
        } else if ((month == 6 && day >= 22) || (month == 7 && day <= 22)) {
            return "Cung Cự Giải (21/6 - 22/7)\n" +
                   "Biểu tượng: ♋ Con cua\n" +
                   "Nguyên tố: Nước\n" +
                   "Hành tinh cai quản: Mặt Trăng\n" +
                   "Đặc điểm nổi bật: Nhạy cảm, chu đáo, bảo vệ, tình cảm.\n" +
                   "Khuyết điểm: Dễ bị tổn thương, hay lo lắng, bám víu.";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Cung Sư Tử (23/7 - 22/8)\n" +
                   "Biểu tượng: ♌ Con sư tử\n" +
                   "Nguyên tố: Lửa\n" +
                   "Hành tinh cai quản: Mặt Trời\n" +
                   "Đặc điểm nổi bật: Tự tin, hào phóng, sáng tạo, lãnh đạo.\n" +
                   "Khuyết điểm: Kiêu ngạo, thích thể hiện, bướng bỉnh.";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Cung Xử Nữ (23/8 - 22/9)\n" +
                   "Biểu tượng: ♍ Trinh nữ\n" +
                   "Nguyên tố: Đất\n" +
                   "Hành tinh cai quản: Sao Thủy\n" +
                   "Đặc điểm nổi bật: Cẩn thận, tỉ mỉ, phân tích, thực tế.\n" +
                   "Khuyết điểm: Hay chỉ trích, quá cầu toàn, lo lắng.";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 23)) {
            return "Cung Thiên Bình (23/9 - 22/10)\n" +
                   "Biểu tượng: ♎ Cái cân\n" +
                   "Nguyên tố: Khí\n" +
                   "Hành tinh cai quản: Sao Kim\n" +
                   "Đặc điểm nổi bật: Hòa nhã, công bằng, thẩm mỹ tốt, lãng mạn.\n" +
                   "Khuyết điểm: Thiếu quyết đoán, hay do dự, thích nịnh nọt.";
        } else if ((month == 10 && day >= 24) || (month == 11 && day <= 22)) {
            return "Cung Bọ Cạp (23/10 - 21/11)\n" +
                   "Biểu tượng: ♏ Con bọ cạp\n" +
                   "Nguyên tố: Nước\n" +
                   "Hành tinh cai quản: Sao Diêm Vương\n" +
                   "Đặc điểm nổi bật: Quyết đoán, trung thành, bí ẩn, mãnh liệt.\n" +
                   "Khuyết điểm: Ghen tuông, thù dai, chiếm hữu.";
        } else if ((month == 11 && day >= 23) || (month == 12 && day <= 21)) {
            return "Cung Nhân Mã (22/11 - 21/12)\n" +
                   "Biểu tượng: ♐ Người bắn cung\n" +
                   "Nguyên tố: Lửa\n" +
                   "Hành tinh cai quản: Sao Mộc\n" +
                   "Đặc điểm nổi bật: Lạc quan, tự do, phiêu lưu, triết lý.\n" +
                   "Khuyết điểm: Thiếu kiên nhẫn, vô tư quá mức, không tế nhị.";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "Cung Ma Kết (22/12 - 19/1)\n" +
                   "Biểu tượng: ♑ Con dê biển\n" +
                   "Nguyên tố: Đất\n" +
                   "Hành tinh cai quản: Sao Thổ\n" +
                   "Đặc điểm nổi bật: Thực tế, tham vọng, kiên trì, có trách nhiệm.\n" +
                   "Khuyết điểm: Bảo thủ, nghiêm khắc, quá cẩn trọng.";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Cung Bảo Bình (20/1 - 18/2)\n" +
                   "Biểu tượng: ♒ Người mang nước\n" +
                   "Nguyên tố: Khí\n" +
                   "Hành tinh cai quản: Sao Thiên Vương\n" +
                   "Đặc điểm nổi bật: Sáng tạo, độc lập, thân thiện, nhân đạo.\n" +
                   "Khuyết điểm: Nổi loạn, cứng đầu, xa cách.";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "Cung Song Ngư (19/2 - 20/3)\n" +
                   "Biểu tượng: ♓ Hai con cá\n" +
                   "Nguyên tố: Nước\n" +
                   "Hành tinh cai quản: Sao Hải Vương\n" +
                   "Đặc điểm nổi bật: Nhạy cảm, trực giác tốt, mơ mộng, nghệ thuật.\n" +
                   "Khuyết điểm: Hay trốn tránh, mơ mộng quá mức, dễ bị ảnh hưởng.";
        } else {
            return "Bạn đã nhập sai. Mời bạn nhập lại.";
        }
    }
}
