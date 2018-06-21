/**
 * @file add-user.vue
 * @author liumapp
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/17/18
 */
<template>
<div>
  <Form ref="addUserForm" :model="addUserModel" :rules="addUserRule">
    <FormItem label="姓名" prop="name">
      <Input type="text" v-model="addUserModel.name"></Input>
    </FormItem>
    <FormItem label="年龄" prop="age">
      <Input type="text" v-model="addUserModel.age" number></Input>
    </FormItem>
    <FormItem label="性别" prop="sex" >
      <RadioGroup v-model="addUserModel.sex" style="margin-top: -3px">
        <Radio label="男"></Radio>
        <Radio label="女"></Radio>
      </RadioGroup>
    </FormItem>
    <FormItem>
      <Button type="primary" @click="handleSubmit('addUserForm')">Submit</Button>
      <Button type="ghost" @click="handleReset('addUserForm')">Reset</Button>
    </FormItem>
  </Form>
</div>
</template>
<script>
import Util from '@/libs/util'
export default {
  name: 'add-user',
  data () {
    return {
      addUserModel: {
        name: '张三',
        age: 18,
        sex: '男'
      },
      addUserRule: {
        name: [
          {
            type: 'string',
            min: 2,
            max: 20,
            message: 'the username size shall be no more than 20 chars and no less than 2 chars ',
            trigger: 'blur'
          }
        ],
        age: [
          {
            type: 'number',
            min: 18,
            max: 100,
            message: 'the age must be a number and between 18 to 100',
            trigger: 'blur'
          }
        ]
      }
    }
  },
  methods: {
    handleSubmit (name) {
      this.$refs[name].validate((valid) => {
        if (valid) {
          Util.post('user/add', this.addUserModel).then(res => {
            this.$Message.success('Success!');
            this.$emit('getUserId', res.data);
            this.$emit('next');
          });
        } else {
          this.$Message.error('Fail!');
        }
      });
    },
    handleReset (name) {
      this.$refs[name].resetFields();
    }
  }
}
</script>
