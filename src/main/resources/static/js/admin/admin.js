document.getElementById('typeSelect').addEventListener('change', function() {
console.log('a');
        var formSelect = document.getElementById('formSelect');
        // 첫 번째 셀렉트에서 "answer"를 선택한 경우
        if (this.value === 'answer') {
        console.log('d');
            formSelect.removeAttribute('required'); // required 속성 제거
            formSelect.setAttribute('disabled', true); // disabled 속성 추가
            // document.getElementById('formSelect').value = 'answer';
        } else {
            // "answer" 이외의 값을 선택한 경우, 원래 상태로 되돌림
            formSelect.setAttribute('required', true); // required 속성 추가
            formSelect.removeAttribute('disabled'); // disabled 속성 제거
        }
});