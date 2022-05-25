package com.company;

import org.junit.jupiter.api.Test;

import static com.company.Paragraph.catWhiteSpace;
import static org.junit.jupiter.api.Assertions.*;

/** 기본경로 테스팅 코드 - 조건이 6개이므로, 7개의 테스트 케이스.
 *  근데 코드 커버리지의 경우에는 NULL, back_black 두 개의 테스트 케이스만으로 달성되었다. */

class ParagraphBasicPathTesting {

    String str_null;
    String str_back_blank = "helloworld!  ";
    String str_empty = "";
    String str_len1_char = "h";
    String str_len1_blank = " ";
    String str_len2_blank = "  ";
    String str_middle_blank = "hello  world!";  // Or String frontblank = "  helloworld!";

    /** 입력 String이 NULL인 경우 */
    // 1 2 13
    @Test
    void string_null() {
        catWhiteSpace(str_null);
    }

    /** 입력 String의 공백이 뒤에 있는 경우 */
    // 1 3 4 5 6 7 9 6 7 8 10 11 3 12 13
    @Test
    void string_back_blank() {
        catWhiteSpace(str_back_blank);
    }

    /** 입력 String의 길이가 0인 경우 (NULL 아님) */
    // 1 3 12 13
    @Test
    void string_empty() {
        catWhiteSpace(str_empty);
    }

    /** 입력 String의 길이가 1인 경우 (blank 아님)*/
    // 1 3 4 6 10 11 3 12 13
    @Test
    void string_len1_char() {
        catWhiteSpace(str_len1_char);
    }

    /** 입력 String의 길이가 1인 경우 (blank) */
    // 1 3 4 5 6 7 8 10 3 12 13
    @Test
    void string_len1_blank() {
        catWhiteSpace(str_len1_blank);
    }

    /** 입력 String의 길이가 2인 경우 (blank) */
    // 1 3 4 5 6 7 9 6 7 8 10 3 12 13
    @Test
    void string_len2_blank() {
        catWhiteSpace(str_len2_blank);
    }

    /** 입력 String의 공백이 중간 또는 맨 앞에 있는 경우 */
    // 1 3 4 5 6 7 9 6 10 11 3 12 13
    @Test
    void string_middle_blank() {
        catWhiteSpace(str_middle_blank);
    } // 또는 void string_front_blank() { catWhiteSpace(str_front_blank); }
}