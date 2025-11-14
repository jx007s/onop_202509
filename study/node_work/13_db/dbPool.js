const mysql = require('mysql2');

// DB 연결 풀 생성
const pool = mysql.createPool({
    host: 'localhost',
    user: 'onop',
    password: '123456',
    database: 'onop_db',
    waitForConnections: true, // 모든 커넥션이 사용 중일 때 대기 여부
    connectionLimit: 10,      // 최대 연결 개수
    queueLimit: 0             // 대기열 제한 (0이면 무제한)
});

// 연결 테스트
pool.getConnection((err, connection) => {
    if (err) {
        console.error('DB 연결 실패:', err.message);
    } else {
        console.log('DB 연결 성공 (Pool ID):', connection.threadId);
        connection.release(); // 반드시 반환해야 함
    }
});

// pool 객체를 모듈로 내보내기
module.exports = pool;
