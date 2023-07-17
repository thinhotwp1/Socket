# Socket
SocketTCP/IP + SocketUDP + WebSocket:

1. Stream Socket hay còn gọi là socket hướng kết nối, là socket hoạt động thông qua giao thức TCP (Transmission Control Protocol). Stream Socket chỉ hoạt động khi server và client đã kết nối với nhau. Ngược lại đây chính là định nghĩa cho câu hỏi: “Giao thức TCP là gì?“
   
TCP/IP viết tắt của Transmission Control Protocol (TCP) và Internet Protocol (IP) là giao thức cài đặt truyền thông, chồng giao thức mà hầu hết các mạng máy tính ngày nay đều sử dụng để kết nối. TCP/IP được đặt theo tên của 2 giao thức là giao thức điều khiển giao vận và giao thức liên mạng. Đây là 2 giao thức đầu tiên trên thế giới được định nghĩa. TCP/IP được phát triển vào năm 1978 bởi Bob Kahn và Vint Cerf. 


Ưu điểm của Stream Socket là gì?

Dữ liệu truyền đi được đảm bảo truyền đến đúng nơi nhận, đúng thứ tự với thời gian nhanh chóng. Mỗi thông điệp gửi đi đều có xác nhận trả về để thông báo cho người dùng thông tin về quá trình truyền tải. 

Nhược điểm của Stream Socket là gì?

Giữa máy chủ và máy nhận chỉ có 1 IP, nên khi kết nối, 1 máy phải chờ máy còn lại chấp nhận kết nối.


3. Datagram Socket hay còn gọi là socket không hướng kết nối, là socket hoạt động thông qua giao thức UDP ( User Datagram Protocol). Datagram Socket có thể hoạt động kể cả khi không có sự thiết lập kết nối giữa 2 máy với nhau. Nói cách khác, đây cũng chính là định nghĩa cho câu hỏi: “Giao thức UDP là gì?“
   
Ưu điểm của Datagram Socket là gì?

Quá trình kết nối và truyền tải thông tin đơn giản, không cần thực hiện nhiều thao tác.

Thời gian truyền tải dữ liệu cực nhanh.


Nhược điểm của Datagram Socket là gì?

Quá trình truyền thông tin không đảm bảo tin cậy, thông tin có thể truyền sai thứ tự hoặc bị lặp.


5. Websocket là công cụ hỗ trợ việc kết nối qua lại trên internet giữa client và server. Giúp diễn ra nhanh chóng và hiệu quả hơn thông qua việc sử dụng TCP socket. Không chỉ sử dụng riêng cho ứng dụng web, Websocket có thể áp dụng cho bất kì ứng dụng nào khác cần có sự trao đổi thông tin trên Internet.


Ưu điểm của Websocket là gì?

Websocket mang lại nhiều ưu điểm trong việc kết nối giữa client và server. Cụ thể như sau:

Tăng tốc độ truyền tải thông tin giữa 2 chiều

Dễ phát hiện và xử lý trong trường hợp có lỗi xảy ra

Dễ dàng sử dụng, không cần cài đặt thêm các phần mềm bổ sung khác

Không cần sử dụng nhiều phương pháp kết nối khác nhau


Nhược điểm của Websocket là gì?

Một số nhược điểm của Websocket mà bạn cần lưu ý khi sử dụng có thể kể đến như:

Chưa hỗ trợ trên tất cả các trình duyệt

Với các dịch vụ có phạm vi yêu cầu, Websocket chưa hỗ trợ hoàn toàn.
