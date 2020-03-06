# Project Vertx-web-skeleton - Example vertx with eventbus.
Project sử dụng Vertx với java.
# Purpose
Project mẫu về vertx sử dụng eventbus:
- Phân lớp kiến trúc giưã các tầng nghiệp vụ.
- Tạo nhiều verticle cho từng tầng nghiệp vụ riêng biệt.
- Sử dụng eventbus giao tiếp giưã các tầng nghiệp vụ.
- Sử dụng LogAsync cho việc ghi log.
- Validate riêng cho từng model.
- Phân dõ các loại exception cho từng trường hợp.
- Hệ thống hoạt động ổn định, kiểm soát tốt code, lỗi, log...Không bị quá tải.
# Project Details
- Xem trong project.
- Api test: 
    - GET: /books
        + Nếu thành công: insert 1 bản ghi vào collection `book` trong mongodb.
    - GET: /books/...
        + Test authentication api với thông tin xác thực users.properties.  
- Fix lỗi: 'io.vertx.codegen.CodeGenProcessor not found'khi chạy giưã các version gradle: 
    + Chỉnh sửa cấu hình trong file build.gradle.
        - Với gradle > 5 mở comment dòng: options.annotationProcessorPath = configurations.annotationProcessor
        - Với gradle < 5 comment dòng: options.annotationProcessorPath = configurations.annotationProcessor
# Getting Started
- Clone code
- Install mongoDb, elasticSearch
- Set up environment: Java 8, Gradle
- Config lại file my_config các uri cho việc kết nối.
- Config lại file xác thực users.properties. 
- Development IDE: IntelliJ
## Build
- Build trên terminal:
``$ cd {projectDir}``
- Lệnh build: 
``$ ./gradlew build``
- Khi chạy trên cmd, sẽ có log và đến dòng này tức là app đã khởi động thành công
``
INFO: Succeeded in deploying verticle
``
- Khi tắt ứng dụng: (thao tác phím hoặc đóng cửa sổ terminal)
``ctrl + c``
## Dynamic Build properties
```
- Mặc định khi chạy project sẽ load cấu hình từ argument truyền vào: 
- Cần thêm agument khi chạy: run vn.eway.MainVerticle -conf=<Path_file_config>.json
- File config lưu cấu hình dưới dạng json.
- Để đảm bảo an toàn về mặt bảo mật: cần truyền đường dẫn file config vào trong quá trình
start.
```
## Testing
Chạy test:

#Author
```
Name: Nguyen Chuyen - Chuyenns
Email: chuyenns@eway.vn
```
#Contributors
```
Name: Truong Thanh Tung - tungtt
Email: tungtt@eway.vn
---------------------------
Name: Do Tuan Vu - vudt2
Email: vudt2@eway.vn
---------------------------
Name: Pham Phuong Tu - tupp
Email: tupp@eway.vn
---------------------------
```
#Acknowledgments
```
Java core
Verx
MongoDB
ElasticSearch
```