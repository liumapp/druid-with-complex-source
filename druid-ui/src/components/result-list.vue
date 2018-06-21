/**
 * @file result-list.vue
 * @author liumapp
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/17/18
 */
<template>
<div style="text-align:center">
  <Row>
    <Col span="8">客户姓名</Col>
    <Col span="16">{{ detail.name }}</Col>
  </Row>
  <Row>
    <Col span="8">产品名称</Col>
    <Col span="16">{{ detail.products }}</Col>
  </Row>
  <Row>
    <Col span="8">售价</Col>
    <Col span="16">{{ detail.price }}</Col>
  </Row>
  <Row>
    <Col span="8">收货地址</Col>
    <Col span="16">{{ detail.province }} / {{ detail.city }} / {{ detail.area }}</Col>
  </Row>
</div>
</template>
<script>
import Util from '@/libs/util'
export default {
  name: 'result-list',
  props: {
    orderId: 0,
    userId: 0
  },
  data () {
    return {
      detail: {
        orderId: 0,
        userId: 0,
        name: '',
        products: '',
        price: 0,
        province: '',
        city: '',
        area: ''
      }
    };
  },
  mounted () {
    Util.post('trade/detail', {
      id: this.orderId,
      userid: this.userId
    }).then (res => {
      this.detail = res.data;
    });
  },
  methods: {

  }
}
</script>
