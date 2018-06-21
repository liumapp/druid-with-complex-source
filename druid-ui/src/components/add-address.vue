/**
 * @file add-address.vue
 * @author liumapp
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/17/18
 */
<template>
<div>
  <Form ref="addAddressForm" :model="addAddressModel" :rule="addAddressRule">
    <FormItem label="地址" prop="address">
      <br>
      <al-selector data-type="name" v-model="addAddressModel.address" level="2"/>
    </FormItem>
    <FormItem>
      <Button type="primary" @click="handleSubmit('addAddressForm')">Submit</Button>
    </FormItem>
  </Form>
</div>
</template>
<script>
import Util from '@/libs/util'
export default {
  name: 'add-address',
  props: {
    userId: 0
  },
  data () {
    return {
      addAddressModel: {
        address: [],
      },
      addAddressRule: {
        address: []
      }
    }
  },
  methods: {
    checkAddress () {
      let length = this.addAddressModel.address.length;
      console.log(length);
      let negative = length == 1 ? this.$Message.error('请输入市区信息') : length == 2 ? this.$Message.error('请输入区域信息') : length == 0 ? this.$Message.error('地址信息请输入') : null;
      if (negative === null) return true;
      return false;
    },
    handleSubmit (name) {
      this.$refs[name].validate((valid) => {
        if (valid && this.checkAddress()) {
          Util.post('address/add', {
            userid: this.userId,
            province: this.addAddressModel.address[0],
            city: this.addAddressModel.address[1],
            area: this.addAddressModel.address[2]
          }).then(res => {
            this.$Message.success('Success!');
            this.$emit('next');
          });
        }
      });
    },
  }

}
</script>
