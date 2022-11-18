function isPrimeNumber(z) {
    let count = 0;

    for (let i = 1; i <= z; i++) {
        if (z % i == 0) {
            count++;
        }
    }

    if (count == 2) {
        return true;
    } else {
        return false;
    }

    console.log('hahahaha');
}

function isPrimeNumberNoReturn(z) {
    let count = 0;

    for (let i = 1; i <= z; i++) {
        if (z % i == 0) {
            count++;
        }
    }

    if (count == 2) {
        console.log('Day la so nguyen to :)')
    } else {
        console.log('KHONG phai so nguyen to :(')
    }

    console.log('hahahaha');
}
