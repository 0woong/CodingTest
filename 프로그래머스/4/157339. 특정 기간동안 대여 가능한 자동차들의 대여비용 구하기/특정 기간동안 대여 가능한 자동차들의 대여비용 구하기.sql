-- 코드를 입력하세요
SELECT distinct history.car_id, car.car_type, round(daily_fee * 30 * (100-discount_rate) /100) as fee
from CAR_RENTAL_COMPANY_RENTAL_HISTORY as history
left join CAR_RENTAL_COMPANY_CAR as car on history.car_id = car.car_id
left join CAR_RENTAL_COMPANY_DISCOUNT_PLAN as plan on car.car_type = plan.car_type
where duration_type = '30일 이상'
and car.car_type in ('SUV','세단')
and round(daily_fee * 30 * (100-discount_rate)/100) between 500000 and 2000000
and history.car_id not in(
    select car_id
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where end_date >= '2022-11-01' and start_date <= '2022-11-30'
)
order by fee desc, car.car_type, history.car_id desc