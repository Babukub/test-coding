# test-coding

# Test Cases: GradeCalculator

**System under test:** `GradeCalculator.gradeOf(int score)`  
**Framework:** JUnit 4.13.2 (TDD)

## Requirements

| Req ID | Requirement |
|:-:|:--|
| R1 | คะแนน 0–100 ต้องถูกแปลงเป็นเกรดตามช่วงที่กำหนด (A, B+, B, C+, C, D+, D, F) |
| R2 | คะแนนน้อยกว่า 0 หรือมากกว่า 100 ต้องโยน IllegalArgumentException |
| R3 | ทดสอบค่าขอบเขตของแต่ละช่วงเกรด รวมถึงค่าต่ำสุดและสูงสุด |
| R4 | หลังการทดสอบทั้งหมดผ่าน ให้ Refactor โดยผลการทดสอบต้องยังผ่าน |

## Grade ranges

| Grade | A | B+ | B | C+ | C | D+ | D | F |
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|
| Score | 80–100 | 75–79 | 70–74 | 65–69 | 60–64 | 55–59 | 50–54 | 0–49 |

## Test Cases

| TC ID | Req ID | Feature | Test Scenario | Type | Technique | Priority | Preconditions | Test Data | Test Steps | Expected Result | Actual Result | Status |
|:--|:--|:--|:--|:--|:--|:--|:--|:--|:--|:--|:--|:--|
| TC-001 | R1 | การแปลงคะแนนเป็นเกรด | คะแนน 100 ต้องได้เกรด A | ปกติ | Equivalence Partitioning | H | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 100 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(100) | คืนค่า "A" |  | ยังไม่ทดสอบ |
| TC-002 | R1 | การแปลงคะแนนเป็นเกรด | คะแนน 80 ต้องได้เกรด A (ขอบล่างของ A) | ขอบเขต | Boundary Value Analysis | H | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 80 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(80) | คืนค่า "A" |  | ยังไม่ทดสอบ |
| TC-003 | R1 | การแปลงคะแนนเป็นเกรด | คะแนน 79 ต้องได้เกรด B+ | ขอบเขต | Boundary Value Analysis | H | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 79 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(79) | คืนค่า "B+" |  | ยังไม่ทดสอบ |
| TC-004 | R1 | การแปลงคะแนนเป็นเกรด | คะแนน 75 ต้องได้เกรด B+ | ขอบเขต | Boundary Value Analysis | M | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 75 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(75) | คืนค่า "B+" |  | ยังไม่ทดสอบ |
| TC-005 | R1 | การแปลงคะแนนเป็นเกรด | คะแนน 74 ต้องได้เกรด B | ขอบเขต | Boundary Value Analysis | H | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 74 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(74) | คืนค่า "B" |  | ยังไม่ทดสอบ |
| TC-006 | R1 | การแปลงคะแนนเป็นเกรด | คะแนน 70 ต้องได้เกรด B | ขอบเขต | Boundary Value Analysis | M | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 70 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(70) | คืนค่า "B" |  | ยังไม่ทดสอบ |
| TC-007 | R1 | การแปลงคะแนนเป็นเกรด | คะแนน 69 ต้องได้เกรด C+ | ขอบเขต | Boundary Value Analysis | H | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 69 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(69) | คืนค่า "C+" |  | ยังไม่ทดสอบ |
| TC-008 | R1 | การแปลงคะแนนเป็นเกรด | คะแนน 65 ต้องได้เกรด C+ | ขอบเขต | Boundary Value Analysis | M | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 65 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(65) | คืนค่า "C+" |  | ยังไม่ทดสอบ |
| TC-009 | R1 | การแปลงคะแนนเป็นเกรด | คะแนน 64 ต้องได้เกรด C | ขอบเขต | Boundary Value Analysis | H | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 64 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(64) | คืนค่า "C" |  | ยังไม่ทดสอบ |
| TC-010 | R1 | การแปลงคะแนนเป็นเกรด | คะแนน 60 ต้องได้เกรด C | ขอบเขต | Boundary Value Analysis | M | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 60 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(60) | คืนค่า "C" |  | ยังไม่ทดสอบ |
| TC-011 | R1 | การแปลงคะแนนเป็นเกรด | คะแนน 59 ต้องได้เกรด D+ | ขอบเขต | Boundary Value Analysis | H | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 59 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(59) | คืนค่า "D+" |  | ยังไม่ทดสอบ |
| TC-012 | R1 | การแปลงคะแนนเป็นเกรด | คะแนน 55 ต้องได้เกรด D+ | ขอบเขต | Boundary Value Analysis | M | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 55 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(55) | คืนค่า "D+" |  | ยังไม่ทดสอบ |
| TC-013 | R1 | การแปลงคะแนนเป็นเกรด | คะแนน 54 ต้องได้เกรด D | ขอบเขต | Boundary Value Analysis | H | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 54 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(54) | คืนค่า "D" |  | ยังไม่ทดสอบ |
| TC-014 | R1 | การแปลงคะแนนเป็นเกรด | คะแนน 50 ต้องได้เกรด D | ขอบเขต | Boundary Value Analysis | M | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 50 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(50) | คืนค่า "D" |  | ยังไม่ทดสอบ |
| TC-015 | R1 | การแปลงคะแนนเป็นเกรด | คะแนน 49 ต้องได้เกรด F | ขอบเขต | Boundary Value Analysis | H | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 49 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(49) | คืนค่า "F" |  | ยังไม่ทดสอบ |
| TC-016 | R1 | การแปลงคะแนนเป็นเกรด | คะแนน 0 ต้องได้เกรด F | ขอบเขต | Boundary Value Analysis | H | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 0 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(0) | คืนค่า "F" |  | ยังไม่ทดสอบ |
| TC-017 | R2 | ตรวจสอบคะแนนนอกช่วง | คะแนน -1 ต้องเกิด IllegalArgumentException | ผิดปกติ | Boundary Value Analysis | H | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | -1 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(-1)<br>3) ตรวจสอบ exception | โยน IllegalArgumentException |  | ยังไม่ทดสอบ |
| TC-018 | R2 | ตรวจสอบคะแนนนอกช่วง | คะแนน 101 ต้องเกิด IllegalArgumentException | ผิดปกติ | Boundary Value Analysis | H | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 101 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(101)<br>3) ตรวจสอบ exception | โยน IllegalArgumentException |  | ยังไม่ทดสอบ |
| TC-019 | R1 | การแปลงคะแนนเป็นเกรด | คะแนนตัวอย่างภายในช่วง 90 ต้องได้เกรด A | ปกติ | Equivalence Partitioning | M | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 90 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(90) | คืนค่า "A" |  | ยังไม่ทดสอบ |
| TC-020 | R1 | การแปลงคะแนนเป็นเกรด | คะแนนตัวอย่างภายในช่วง 72 ต้องได้เกรด B | ปกติ | Equivalence Partitioning | M | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 72 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(72) | คืนค่า "B" |  | ยังไม่ทดสอบ |
| TC-021 | R1 | การแปลงคะแนนเป็นเกรด | คะแนนตัวอย่างภายในช่วง 62 ต้องได้เกรด C | ปกติ | Equivalence Partitioning | M | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 62 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(62) | คืนค่า "C" |  | ยังไม่ทดสอบ |
| TC-022 | R1 | การแปลงคะแนนเป็นเกรด | คะแนนตัวอย่างภายในช่วง 52 ต้องได้เกรด D | ปกติ | Equivalence Partitioning | M | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 52 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(52) | คืนค่า "D" |  | ยังไม่ทดสอบ |
| TC-023 | R1 | การแปลงคะแนนเป็นเกรด | คะแนนตัวอย่างภายในช่วง 20 ต้องได้เกรด F | ปกติ | Equivalence Partitioning | M | มีคลาส GradeCalculator และเมธอด gradeOf(int score) | 20 | 1) สร้าง GradeCalculator<br>2) เรียก gradeOf(20) | คืนค่า "F" |  | ยังไม่ทดสอบ |
| TC-024 | R4 | การ Refactor | หลัง Refactor แล้วผลการทดสอบเดิมทั้งหมดต้องไม่เปลี่ยน | ไม่ใช่เชิงฟังก์ชัน | Regression Testing | M | กรณีทดสอบ TC-001 ถึง TC-023 ผ่านทั้งหมด และมีการ Refactor โค้ดแล้ว | รันชุดทดสอบ TC-001 ถึง TC-023 ซ้ำ | 1) Refactor เมธอด gradeOf<br>2) รัน JUnit test ทั้งหมด | ผลลัพธ์ทุกกรณียังคงผ่าน และคืนเกรด/โยน exception ตามข้อกำหนดเดิม |  | ยังไม่ทดสอบ |