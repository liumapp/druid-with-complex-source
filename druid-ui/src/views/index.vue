/**
 * @file index.vue
 * @author liumapp
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/17/18
 */
<template>
  <div>
    <Row>
      <Col span="18" offset="3">
      <Card>
        <Steps :current="current">
          <Step title="提交基础信息" content="上传基础用户信息"></Step>
          <Step title="提交地址" content="用户提交收货地址"></Step>
          <Step title="提交订单" content="用户提交订单信息"></Step>
          <Step title="订单结果" content="展示订单结果"></Step>
        </Steps>
        <add-user v-if="current == 0" @next="nextStep" @getUserId="getUserId"></add-user>
        <add-address v-if="current == 1" @next="nextStep" @prev="prevStep" :userId="userId"></add-address>
        <add-order v-if="current == 2" @next="nextStep" @prev="prevStep" :userId="userId" @getOrderId="getOrderId"></add-order>
        <result-list v-if="current == 3" @prev="prevStep" :userId="userId" :orderId="orderId"></result-list>
      </Card>
      </Col>
    </Row>
  </div>
</template>
<script>
import AddAddress from '@/components/add-address'
import AddOrder from '@/components/add-order'
import AddUser from '@/components/add-user'
import ResultList from '@/components/result-list'
import Util from '@/libs/util'
export default {
  name: 'index',
  components: {
    AddAddress, AddOrder, AddUser, ResultList
  },
  data () {
    return {
      current: 0,
      userId: 0,
      orderId: 0
    }
  },
  methods: {
    getUserId (id) {
      this.userId = id;
    },
    getOrderId (id) {
      this.orderId = id;
    },
    nextStep () {
      this.current++;
    },
    prevStep () {
      this.current--;
    }
  }
}
</script>
